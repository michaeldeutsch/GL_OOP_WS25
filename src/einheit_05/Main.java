package einheit_05;

public class Main {


    public static void main(String[] args) {
        Weihnachtsmarkt wien = new Weihnachtsmarkt("Wien", Bundesland.WIEN);
        String einName = "Wien";
        try {
            Weihnachtsmarkt graz = new Weihnachtsmarkt(einName, Bundesland.STEIERMARK);
            System.out.println(graz);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        Stadl huette1 = new Stadl(Bereich.HOLZ, "KUNZ");
        Stadl huette2 = new Stadl(Bereich.PUNSCH, "FRITZ");
        Stadl huette3 = new Stadl(Bereich.SWEETS, "SUSI");
        System.out.println(huette1);
        System.out.println(huette2);

        boolean zubuchungErfolgt = wien.bekommt(huette1);


        try {
            wien.bekommt(huette1);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        System.out.println(zubuchungErfolgt?"Erfolgreich":"Nicht erfolgreich");
        wien.showStandl();


        System.out.println("Programm ordnungsgemäß beendet");


    }
}
