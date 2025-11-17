package einheit_05;

import java.util.ArrayList;

public class Weihnachtsmarkt {

    private static ArrayList<String> ALLE_NAMEN = new ArrayList();
    private String name; // unique
    private Bundesland bundesland;
    private ArrayList<Stadl> stadlListe;


    public Weihnachtsmarkt(String name, Bundesland bundesland) {
        if (name == null) {
            throw new IllegalArgumentException("name is null");
        }

        if (ALLE_NAMEN.contains(name)) {
            throw new IllegalArgumentException("Namen bereits vorhanden");
        }

        if (name.trim().length() == 0) {
            throw new IllegalArgumentException("Länge ist null/Feld leer");
        }


        this.name = name;
        this.bundesland = bundesland;
        this.stadlListe = new ArrayList<>();
        ALLE_NAMEN.add(name); // Register befüllen
    }

    @Override
    public String toString() {
        return "Weihnachtsmarkt{" +
                "name='" + name + '\'' +
                ", bundesland=" + bundesland +
                ", stadlListe=" + stadlListe +
                '}';
    }


    public boolean bekommt(Stadl huette1) {
        if(stadlListe.contains(huette1)) {
            throw new IllegalArgumentException("Stadl ist bereits vorhanden");
        }
       return stadlListe.add(huette1);

    }

    public void showStandl(){

        System.out.println(this.name + " hat aktuell " + stadlListe.size() + " Standl, diese wären: ");
        stadlListe.forEach(System.out::println);
    }

}

