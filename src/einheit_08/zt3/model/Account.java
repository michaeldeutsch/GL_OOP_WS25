package einheit_08.zt3.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

/**
 * Simple account that holds a balance.
 * "debit" and "credit" are modeled as increasing the balance for simplicity.
 */
public final class Account {
    private final String number;
    private BigDecimal balance = BigDecimal.ZERO.setScale(2, RoundingMode.HALF_UP);
    private final String ownerId; // company id or finance office name

    public Account(String number, String ownerId) {
        this.number = Objects.requireNonNull(number, "number must not be null");
        this.ownerId = Objects.requireNonNull(ownerId, "ownerId must not be null");
        if (number.isBlank()) throw new IllegalArgumentException("Account number must not be blank.");
    }

    public String getNumber() { return number; }
    public String getOwnerId() { return ownerId; }

    public BigDecimal getBalance() { return balance; }

    public void add(BigDecimal amount) {
        Objects.requireNonNull(amount, "amount must not be null");
        if (amount.signum() < 0) throw new IllegalArgumentException("Amount must not be negative.");
        balance = balance.add(amount).setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", ownerId='" + ownerId + '\'' +
                ", balance=" + balance +
                '}';
    }
}
