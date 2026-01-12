package einheit_08.zt3.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Juristische Person mit Aufsichtsrat.
 */
public final class JuristicPerson extends Company {
    private final List<String> supervisoryBoardMembers;

    public JuristicPerson(String name,
                          Industry industry,
                          String expenseAccountNo,
                          String revenueAccountNo,
                          List<String> supervisoryBoardMembers) {
        super(CompanyForm.J, name, industry, expenseAccountNo, revenueAccountNo);

        Objects.requireNonNull(supervisoryBoardMembers, "supervisoryBoardMembers must not be null");
        if (supervisoryBoardMembers.isEmpty())
            throw new IllegalArgumentException("Aufsichtsrat muss mindestens ein Mitglied haben.");

        ArrayList<String> tmp = new ArrayList<>();
        for (String m : supervisoryBoardMembers) {
            if (m == null || m.isBlank())
                throw new IllegalArgumentException("Aufsichtsratsmitglied-Name darf nicht leer sein.");
            tmp.add(m.trim());
        }
        this.supervisoryBoardMembers = Collections.unmodifiableList(tmp);
    }

    public List<String> getSupervisoryBoardMembers() {
        return supervisoryBoardMembers;
    }
}
