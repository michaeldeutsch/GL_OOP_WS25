package einheit_07;

public class Main {


    public static void main(String[] args) {

        Bibliothek vorgarten = new Bibliothek("Vorgarten", "1020", Bundesland.WIEN);
        System.out.println(vorgarten);


        Bibliothek stMarx = new Bibliothek("St. Marx", "1020", Bundesland.WIEN);
        System.out.println(stMarx);

        try {
            Bibliothek innereStadt = new Bibliothek("St. Marx", "1020", Bundesland.WIEN);
            System.out.println(innereStadt);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }


    }
}
