package einheit_06.sidestep;

import java.util.concurrent.ThreadLocalRandom;

public class Main {


    public static void main(String[] args) {


        for(Karten aktuelleKarte : Karten.values()) {
            System.out.println(aktuelleKarte);
        }


        int zufall = ThreadLocalRandom.current().nextInt(0, Karten.values().length);

        Karten spieler1 = Karten.values()[zufall];
        System.out.println("SPieler hat Karte in der Hand: " + spieler1);

        Karten spieler2 = Karten.DAME;

        if(spieler1.getValue() == spieler2.getValue()) {
            System.out.println("Unentschieden");
        } else if (spieler1.getValue() > spieler2.getValue()) {
            System.out.println("Spieler 1 ge");
        }else{
            System.out.println("Spieler 2 ge");
        }

    }


}
