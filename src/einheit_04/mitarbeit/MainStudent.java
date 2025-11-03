package einheit_04.mitarbeit;

public class MainStudent {

    public static void main(String[] args) {

        Student ersterStudent = new Student("Michael");
        Student zweiterStudent = new Student("Peter");
        zweiterStudent.zeigeSummederMitarbeitspunkte();

        ersterStudent.mitarbeitsPunkteHinzufuegen(10);
        ersterStudent.mitarbeitsPunkteHinzufuegen(5);
        ersterStudent.zeigeSummederMitarbeitspunkte();

        System.out.println(ersterStudent.toString());


    }
}
