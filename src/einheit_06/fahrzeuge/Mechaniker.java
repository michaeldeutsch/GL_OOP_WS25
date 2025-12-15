package einheit_06.fahrzeuge;

import java.util.ArrayList;

public class Mechaniker {

    ArrayList<KFZ> reparierteAutos;

    public Mechaniker() {
        this.reparierteAutos = new ArrayList<>();
    }

    public void addAuto(KFZ a){
        reparierteAutos.add(a);
    }



}
