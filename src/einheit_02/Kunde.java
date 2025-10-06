package einheit_02;

import java.time.LocalDate;

public class Kunde {

    String vorname;
    String nachname;
    String geburtsdatum;
    LocalDate geburtsdatum2;

    String telefonnummer;
    String adresse;

    Standorte lieblingsstandort;

    public Kunde(String vorname, String nachname){
        this.vorname = vorname;
        this.nachname = nachname;

    }
   public Kunde(String vorname, String nachname, LocalDate geburtsdatum2){
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsdatum2 = geburtsdatum2;
   }


    public String toString(){
        String lieblingsmarkt  = lieblingsstandort == null?"":lieblingsstandort.toString();
        String geburtsdatum = this.geburtsdatum2 == null?"":this.geburtsdatum2.toString();

        return "Kunde " + vorname + " " + nachname + " " + lieblingsmarkt + " " + geburtsdatum;

       }


}
