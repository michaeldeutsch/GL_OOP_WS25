package einheit_02;

public class StartBrache {
    public static void main(String[] args) {

        Branche aktuelleBranche = Branche.HANDEL;

        System.out.println(aktuelleBranche + " " + aktuelleBranche.getBranchenZahl());


        Karte ersteKarte = Karte.AS;

        Karte gegnerKarte = Karte.BUBE;

        if(ersteKarte.getKartenWert() > gegnerKarte.getKartenWert()){
            System.out.println("Du hast gewonnen");
        }else{
            System.out.println("Du hast verloren");
        }
    }
}
