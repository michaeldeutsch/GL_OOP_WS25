package einheit_03.restaurant;

public class Restaurant {

    private static int COUNTER = 1000;

    private String gf;
    private final int filialID;

    // Bauplan, Karteidruck
    // Verkapselung aller Werte
    // Zugriff auf den gf, gf darf geändert werden,
    // aber gleicher gf nicht nochmal, und gf nur wenn Mayer oder Fritz
    // increment +5
    // wenn nicht valide, entspreche Meldung

    public Restaurant(String gf){
        this.gf = gf;
        this.filialID = COUNTER;
        COUNTER += 5;
    }

    public String toString(){
        return "FilialID: " + filialID + " GF: " + gf;
    }

    public String getGf(){
        return gf;
    }

    public void setGf(String gf) {
        String[] whiteliste = {"Mayer", "Fritz"};

        if(gf.equals(this.gf)){
            System.out.println("GFeingabe ist gleich");
            return;
        }

        for(String aktuellerName : whiteliste){
            if(gf.equals(aktuellerName)){
                this.gf = gf;
                System.out.println("Name wurde geändert");
                return;
            }

        }
        System.out.println("Name ist nicht in der Whitelist");
        System.out.println("Keine Änderung durchgeführt");



    }
}
