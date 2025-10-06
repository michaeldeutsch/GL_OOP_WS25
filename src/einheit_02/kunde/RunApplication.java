package einheit_02.kunde;

import java.time.LocalDate;

public class RunApplication {

    public static void main(String[] args) {
        Kunde ersterKunde = new Kunde("Michael", "Deutsch");
        System.out.println(ersterKunde.toString()); // alt
        ersterKunde.lieblingsstandort = Standorte.TRIESTER_STRASSE;
        System.out.println(ersterKunde.toString()); // neu

        Kunde zweiterKunde = new Kunde("Hand","Huber", LocalDate.of(2000,1,1));
       zweiterKunde.lieblingsstandort = Standorte.DONAUZENTRUM;
        System.out.println(zweiterKunde.toString());




    }
}
