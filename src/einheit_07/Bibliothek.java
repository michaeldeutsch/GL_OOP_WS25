package einheit_07;

import java.util.ArrayList;

public class Bibliothek {

    private static ArrayList<String> BIB_LIST = new ArrayList<>();
    private static int COUNTER = 1000;
    private final int bib_ID;
    private String name;
    private String adresse;
    private Bundesland bundesland;


    public Bibliothek(String name, String adresse,  Bundesland bundesland) {

        if(BIB_LIST.contains(name)) throw new IllegalArgumentException("Name already exists");

        this.bib_ID = COUNTER++;
        this.name=name;
        this.adresse=adresse;
        this.bundesland=bundesland;
        this.BIB_LIST.add(name);
    }

    @Override
    public String toString() {
        return "Bibliothek{" +
                "adresse='" + adresse + '\'' +
                ", bundesland=" + bundesland +
                ", name='" + name + '\'' +
                ", bib_ID=" + bib_ID +
                '}';
    }
}
