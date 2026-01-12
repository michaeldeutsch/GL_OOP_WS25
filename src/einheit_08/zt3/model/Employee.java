package einheit_08.zt3.model;

import java.util.Objects;

public final class Employee {
    private final String personnelNumber; // immutable, unique
    private final String name;
    private final FinanceOffice financeOffice; // exactly one
    private Branch branch; // exactly one

    Employee(String personnelNumber, String name, FinanceOffice financeOffice) {
        this.personnelNumber = requireNonBlank(personnelNumber, "Personalnummer darf nicht leer sein.");
        this.name = requireNonBlank(name, "Mitarbeitername darf nicht leer sein.");
        this.financeOffice = Objects.requireNonNull(financeOffice, "financeOffice must not be null");
    }

    private static String requireNonBlank(String value, String msg) {
        if (value == null || value.isBlank()) throw new IllegalArgumentException(msg);
        return value.trim();
    }

    public String getPersonnelNumber() { return personnelNumber; }
    public String getName() { return name; }
    public FinanceOffice getFinanceOffice() { return financeOffice; }
    public Branch getBranch() { return branch; }

    void assignToBranch(Branch branch) {
        this.branch = Objects.requireNonNull(branch, "branch must not be null");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "personnelNumber='" + personnelNumber + '\'' +
                ", name='" + name + '\'' +
                ", branch=" + (branch == null ? "n/a" : branch.getDesignation()) +
                '}';
    }
}
