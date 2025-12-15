package einheit_06.sidestep;

public class MainDeckGenerator {


    public static void main(String[] args) {

        for (Type type : Type.values()) {
            for(Karten karte : Karten.values()) {
                System.out.println(type + " " + karte);
            }
        }


    }
}
