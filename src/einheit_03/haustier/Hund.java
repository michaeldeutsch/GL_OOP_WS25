package einheit_03.haustier;

public class Hund {

    static int COUNTER = 1; // mitzählt
    String name;
    final int id; // unveränderlich
    Rasse rasse;


    public Hund(String name, Rasse rasse){
        this.name = name;
        this.rasse = rasse;
        this.id = COUNTER++;

    }

    public String toString(){
        return "Hundname " + name + ", Rasse " + rasse + ", ID " + id;
    }



    public static void wievieleHundeGibtes(){
        System.out.println("Es gibt " + (COUNTER-1) + " Hunde");
    }


}
