package einheit_08.osterhase.main;

import einheit_08.osterhase.model.*;

public class Main {
    public static void main(String[] args) {
        Osterwelt w = new Osterwelt();
        Osterhase h1 = w.neuerOsterhase("Norm");
        Superhase h2 = w.neuerSuperhase("Super");

        Nest n1 = w.neuesNest("Nest1", h1);
        n1.addEi(new Ei(Farbe.BLAU));
        n1.addEi(new Ei(Farbe.GELB));
        n1.addEi(new Ei(Farbe.ROT));

        System.out.println(w.findeEierNachFarbe(Farbe.BLAU));
        System.out.println("Fleißigster: " + w.fleissigsterHase().get());
    }
}