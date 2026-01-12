package einheit_08.osterhase.model;

import java.util.*;

public class Osterwelt {
    private final List<Osterhase> hasen = new ArrayList<>();
    private final List<Nest> nester = new ArrayList<>();

    public Osterhase neuerOsterhase(String name) {
        Osterhase h = new Osterhase(name);
        hasen.add(h);
        return h;
    }

    public Superhase neuerSuperhase(String name) {
        Superhase h = new Superhase(name);
        hasen.add(h);
        return h;
    }

    public Nest neuesNest(String name, Osterhase hase) {
        Nest n = new Nest(name, hase);
        nester.add(n);
        return n;
    }

    public List<Ei> findeEierNachFarbe(Farbe f) {
        List<Ei> result = new ArrayList<>();
        for (Nest n : nester)
            for (Ei e : n.getEier())
                if (e.getFarbe() == f) result.add(e);
        return result;
    }

    public Optional<Osterhase> fleissigsterHase() {
        return hasen.stream()
                .max(Comparator.comparingInt(Osterhase::getAnzahlBefuellterNester));
    }
}