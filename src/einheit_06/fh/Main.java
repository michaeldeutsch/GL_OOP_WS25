package einheit_06.fh;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Mensch adam = new Student(1,"Adam","Doe", LocalDate.now(),12, "asdf");

        Student abc = new Student(2,"abc","Doe", LocalDate.now(),12, "asdf");
        Mitarbeiter m = new Mitarbeiter( 1,"Hans","urst",LocalDate.now(),123);

        adam.essen(10, "Brot");


        Student eins = new Student(2,"Max","Muster",LocalDate.now(),123, "Mathe");
        System.out.println(eins.toString());

        System.out.println(adam);
    }
}
