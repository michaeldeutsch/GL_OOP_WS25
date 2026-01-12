package einheit_08.zt3.model;

import java.util.*;

public final class FinanceOffice {
    private final String name; // immutable, unique
    private final Account taxRevenueAccount;

    private final Map<String, Company> companiesById = new LinkedHashMap<>();
    private final Map<String, Employee> employeesByNr = new LinkedHashMap<>();
    private final Map<String, Branch> branchesByDesignation = new LinkedHashMap<>();

    public FinanceOffice(String name, String taxRevenueAccountNo) {
        this.name = requireNonBlank(name, "Finanzamt-Name darf nicht leer sein.");
        this.taxRevenueAccount = new Account(requireNonBlank(taxRevenueAccountNo, "Steuertopf-Konto darf nicht leer sein."), this.name);
    }

    private static String requireNonBlank(String value, String msg) {
        if (value == null || value.isBlank()) throw new IllegalArgumentException(msg);
        return value.trim();
    }

    public String getName() { return name; }
    public Account getTaxRevenueAccount() { return taxRevenueAccount; }

    /**
     * Ein Finanzamt stellt eine Methode zum Hinzufügen eines Unternehmens bereit.
     * Ein Unternehmen darf nur hinzugefügt werden, wenn es noch nicht beim Finanzamt gemeldet ist.
     * Bei erfolgreichem Hinzufügen wird das Finanzamt beim Unternehmen gesetzt und der Status angepasst.
     * Ist das Unternehmen bereits vorhanden, wird eine Exception ausgelöst.
     */
    public void addCompany(Company company) {
        Objects.requireNonNull(company, "company must not be null");

        if (companiesById.containsKey(company.getId())) {
            throw new AlreadyExistsException("Unternehmen mit ID " + company.getId() + " ist beim Finanzamt '" + name + "' bereits vorhanden.");
        }
        if (company.getStatus() == CompanyStatus.REGISTERED || company.getFinanceOffice() != null) {
            throw new IllegalStateException("Unternehmen " + company.getId() + " ist bereits bei einem Finanzamt gemeldet.");
        }

        companiesById.put(company.getId(), company);
        company.registerAt(this);
    }

    /**
     * Entfernt ein Unternehmen. Rückgabe: true, wenn erfolgreich.
     * Entfernen ist nicht möglich, wenn das Unternehmen nicht gemeldet ist.
     */
    public boolean removeCompany(Company company) {
        Objects.requireNonNull(company, "company must not be null");
        if (company.getStatus() != CompanyStatus.REGISTERED || company.getFinanceOffice() != this) return false;

        Company removed = companiesById.remove(company.getId());
        if (removed == null) return false;

        removed.unregister();
        return true;
    }

    public List<Company> getCompanies() {
        return List.copyOf(companiesById.values());
    }

    // --- Employees / branches (minimal API to satisfy constraints) ---

    public Employee hireEmployee(String personnelNumber, String name) {
        if (employeesByNr.containsKey(personnelNumber)) {
            throw new AlreadyExistsException("Mitarbeiter mit Personalnummer " + personnelNumber + " existiert bereits im Finanzamt '" + this.name + "'.");
        }
        Employee e = new Employee(personnelNumber, name, this);
        employeesByNr.put(personnelNumber, e);
        return e;
    }

    public Branch createBranch(String designation, Employee leader) {
        Objects.requireNonNull(leader, "leader must not be null");
        if (branchesByDesignation.containsKey(designation)) {
            throw new AlreadyExistsException("Niederlassung '" + designation + "' existiert bereits im Finanzamt '" + this.name + "'.");
        }
        if (leader.getFinanceOffice() != this) {
            throw new IllegalArgumentException("Leiter muss beim Finanzamt '" + this.name + "' angestellt sein.");
        }
        Branch b = new Branch(this, designation, leader);
        branchesByDesignation.put(designation, b);
        return b;
    }

    public void assignEmployeeToBranch(Employee employee, Branch branch) {
        Objects.requireNonNull(employee, "employee must not be null");
        Objects.requireNonNull(branch, "branch must not be null");
        if (employee.getFinanceOffice() != this) throw new IllegalArgumentException("Mitarbeiter gehört zu einem anderen Finanzamt.");
        if (branch.getFinanceOffice() != this) throw new IllegalArgumentException("Niederlassung gehört zu einem anderen Finanzamt.");
        branch.addEmployeeInternal(employee);
    }

    public List<Branch> getBranches() {
        return List.copyOf(branchesByDesignation.values());
    }

    public List<Employee> getEmployees() {
        return List.copyOf(employeesByNr.values());
    }

    @Override
    public String toString() {
        return "FinanceOffice{" +
                "name='" + name + '\'' +
                ", companies=" + companiesById.size() +
                ", employees=" + employeesByNr.size() +
                ", branches=" + branchesByDesignation.size() +
                '}';
    }
}
