package einheit_02.schueler;

public class Schueler {

     static int COUNTER = 1;

    final int matrikelnummer; // KOnstante setzen

    String name;
    Geschlecht geschlecht;

    public Schueler(String name, Geschlecht geschlecht){
    this.matrikelnummer = COUNTER++;
        this.name = name;
        this.geschlecht = geschlecht;
    }

    public String toString(){
        return "Name " + name + ", Geschlecht " + geschlecht + ", Matrikelnummer " + matrikelnummer;

    }


}
