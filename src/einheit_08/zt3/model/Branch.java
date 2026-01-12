package einheit_08.zt3.model;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public final class Branch {
    private final FinanceOffice financeOffice;
    private final String designation; // unique within finance office
    private final Employee leader;    // exactly one, also an employee of this branch
    private final Map<String, Employee> employeesByNr = new LinkedHashMap<>();

    Branch(FinanceOffice financeOffice, String designation, Employee leader) {
        this.financeOffice = Objects.requireNonNull(financeOffice, "financeOffice must not be null");
        this.designation = requireNonBlank(designation, "Bezeichnung darf nicht leer sein.");
        this.leader = Objects.requireNonNull(leader, "leader must not be null");

        if (leader.getFinanceOffice() != financeOffice)
            throw new IllegalArgumentException("Leiter muss beim selben Finanzamt angestellt sein.");

        addEmployeeInternal(leader); // leader is employee of this branch
    }

    private static String requireNonBlank(String value, String msg) {
        if (value == null || value.isBlank()) throw new IllegalArgumentException(msg);
        return value.trim();
    }

    public FinanceOffice getFinanceOffice() { return financeOffice; }
    public String getDesignation() { return designation; }
    public Employee getLeader() { return leader; }

    public Map<String, Employee> getEmployees() {
        return Collections.unmodifiableMap(employeesByNr);
    }

    void addEmployeeInternal(Employee e) {
        Objects.requireNonNull(e, "employee must not be null");
        if (e.getFinanceOffice() != financeOffice)
            throw new IllegalArgumentException("Mitarbeiter gehört zu einem anderen Finanzamt.");
        if (e.getBranch() != null && e.getBranch() != this)
            throw new IllegalStateException("Mitarbeiter " + e.getPersonnelNumber() + " ist bereits einer anderen Niederlassung zugewiesen.");

        employeesByNr.put(e.getPersonnelNumber(), e);
        e.assignToBranch(this);
    }

    @Override
    public String toString() {
        return "Branch{" +
                "designation='" + designation + '\'' +
                ", leader=" + leader.getName() +
                ", employees=" + employeesByNr.size() +
                '}';
    }
}
