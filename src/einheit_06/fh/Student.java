package einheit_06.fh;

import java.time.LocalDate;

public class Student extends Mensch{

    int matrikelNr;
    String lieblingsLV;
    public Student(int id, String vName, String nName, LocalDate birthday, int matrikelNr, String lieblingsLV) {
        super(id, vName, nName, birthday);
        this.matrikelNr = matrikelNr;
        this.lieblingsLV = lieblingsLV;
    }

    @Override
    public String toString() {
        return "Student " + super.getvName() + " " + super.getnName() + ", Matrikelnr.: " + matrikelNr;
    }
}
