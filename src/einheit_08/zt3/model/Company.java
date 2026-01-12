package einheit_08.zt3.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;

public abstract class Company {
    private static final AtomicLong GLOBAL_COUNTER = new AtomicLong(0);

    private final String id;          // immutable
    private final String name;
    private final Industry industry;  // immutable
    private final BigDecimal taxRate; // immutable (income/corporate)
    private CompanyStatus status = CompanyStatus.PENDING_REGISTRATION;

    private FinanceOffice financeOffice; // set when registered

    private final Account expenseAccount;
    private final Account revenueAccount;

    protected Company(CompanyForm form, String name, Industry industry, String expenseAccountNo, String revenueAccountNo) {
        Objects.requireNonNull(form, "form must not be null");
        this.name = requireNonBlank(name, "name must not be blank");
        this.industry = Objects.requireNonNull(industry, "industry must not be null");

        long next = GLOBAL_COUNTER.incrementAndGet();
        this.id = form.name() + next;

        this.taxRate = switch (form) {
            case E, P -> new BigDecimal("0.30");
            case J -> new BigDecimal("0.25");
        };

        if (Objects.requireNonNull(expenseAccountNo, "expenseAccountNo must not be null").isBlank())
            throw new IllegalArgumentException("Expense account number must not be blank.");
        if (Objects.requireNonNull(revenueAccountNo, "revenueAccountNo must not be null").isBlank())
            throw new IllegalArgumentException("Revenue account number must not be blank.");
        if (expenseAccountNo.equals(revenueAccountNo))
            throw new IllegalArgumentException("Expense account and revenue account must be different.");

        this.expenseAccount = new Account(expenseAccountNo, this.id);
        this.revenueAccount = new Account(revenueAccountNo, this.id);
    }

    private static String requireNonBlank(String value, String msg) {
        if (value == null || value.isBlank()) throw new IllegalArgumentException(msg);
        return value;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public Industry getIndustry() { return industry; }
    public BigDecimal getTaxRate() { return taxRate; }
    public CompanyStatus getStatus() { return status; }
    public FinanceOffice getFinanceOffice() { return financeOffice; }

    public Account getExpenseAccount() { return expenseAccount; }
    public Account getRevenueAccount() { return revenueAccount; }

    void registerAt(FinanceOffice office) {
        this.financeOffice = Objects.requireNonNull(office, "office must not be null");
        this.status = CompanyStatus.REGISTERED;
    }

    void unregister() {
        this.financeOffice = null;
        this.status = CompanyStatus.PENDING_REGISTRATION;
    }

    /**
     * Umsatzsteuer-Voranmeldung.
     * @param netRevenue Umsatz ohne Steuer
     * @param netPurchases Einkäufe ohne Vorsteuer
     */
    public void submitVatPrepayment(BigDecimal netRevenue, BigDecimal netPurchases) {
        Objects.requireNonNull(netRevenue, "netRevenue must not be null");
        Objects.requireNonNull(netPurchases, "netPurchases must not be null");
        if (netRevenue.signum() < 0) throw new IllegalArgumentException("netRevenue must not be negative.");
        if (netPurchases.signum() < 0) throw new IllegalArgumentException("netPurchases must not be negative.");

        if (status != CompanyStatus.REGISTERED || financeOffice == null) {
            throw new IllegalStateException("Company " + id + " is not registered at any finance office.");
        }

        BigDecimal vatRate = new BigDecimal("0.20");
        BigDecimal outputVat = netRevenue.multiply(vatRate);
        BigDecimal inputVat = netPurchases.multiply(vatRate);

        outputVat = outputVat.setScale(2, RoundingMode.HALF_UP);
        inputVat = inputVat.setScale(2, RoundingMode.HALF_UP);

        BigDecimal difference = outputVat.subtract(inputVat).setScale(2, RoundingMode.HALF_UP);

        if (difference.signum() > 0) {
            // Zahllast: pay to finance office, adjust expense account
            financeOffice.getTaxRevenueAccount().add(difference);
            expenseAccount.add(difference);

            System.out.println("USt-Voranmeldung (" + id + "): Zahllast = " + difference + " EUR");
            System.out.println("-> Finanzamt '" + financeOffice.getName() + "' Steuertopf +=" + difference);
            System.out.println("-> Aufwandskonto (" + expenseAccount.getNumber() + ") +=" + difference);
        } else if (difference.signum() < 0) {
            // Gutschrift: adjust revenue account (difference is negative)
            BigDecimal refund = difference.negate();
            revenueAccount.add(refund);

            System.out.println("USt-Voranmeldung (" + id + "): Gutschrift = " + refund + " EUR");
            System.out.println("-> Ertragskonto (" + revenueAccount.getNumber() + ") +=" + refund);
        } else {
            System.out.println("USt-Voranmeldung (" + id + "): keine Zahllast / keine Gutschrift (0,00 EUR).");
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", industry=" + industry +
                ", taxRate=" + taxRate +
                ", status=" + status +
                '}';
    }
}
