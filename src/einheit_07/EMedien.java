package einheit_07;

import java.util.ArrayList;

public class EMedien extends Bibliothek{

    ArrayList<Film> alleFIlme = new ArrayList<>();

    public EMedien(String name, String adresse, Bundesland bundesland) {
        super(name, adresse, bundesland);
        this.alleFIlme = new ArrayList<>();
    }
}
