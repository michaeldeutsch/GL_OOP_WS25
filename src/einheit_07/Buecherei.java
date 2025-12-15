package einheit_07;

import java.util.ArrayList;

public class Buecherei extends Bibliothek{

    ArrayList<Buecher> alleBuecher; // Regal

    public Buecherei(String name, String adresse, Bundesland bundesland) {
        super(name, adresse, bundesland);
        this.alleBuecher = new ArrayList<>();
    }

    public void addBuecher(Buecher b){
        this.alleBuecher.add(b);
    }



}
