package einheit_01.intro;

public class Auto {

    String hersteller;
    int geschwindigkeit;
    int kilometerstand;


    public Auto(String hersteller, int geschwindigkeit, int kilometerstand){
        this.hersteller = hersteller;
        this.geschwindigkeit = geschwindigkeit;
        this.kilometerstand = kilometerstand;

    }

    public String toString(){
        return "Autohersteller " + hersteller + ", Geschwindigkeit " +geschwindigkeit;
    }

}
