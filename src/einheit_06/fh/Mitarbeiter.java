package einheit_06.fh;

import java.time.LocalDate;

public final class Mitarbeiter extends Mensch {

    int gehalt;


    public Mitarbeiter(int id, String vName, String nName, LocalDate birthday, int gehalt) {
        super(id, vName, nName, birthday);
        this.gehalt = gehalt;
    }
}
