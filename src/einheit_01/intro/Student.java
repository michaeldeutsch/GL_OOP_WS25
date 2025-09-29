package einheit_01.intro;

import java.time.LocalDate;

public class Student {

    int matrikelnr;
    String vorname;
    String nachname;
    LocalDate geburtsdatum;

    String studiengang;

    public Student(String vorname, String nachname, String studiengang){
        this.vorname = vorname;
        this.nachname = nachname;
        this.studiengang = studiengang;


    }

    @Override
    public String toString() {
        return "Student{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", geburtsdatum=" + geburtsdatum +
                ", studiengang='" + studiengang + '\'' +
                '}';
    }
}
