package einheit_08.osterhase.model;

import java.util.*;

public class Nest {
    private static final Set<String> NAMES = new HashSet<>();
    private final String name;
    private final Osterhase hase;
    private final List<Ei> eier = new ArrayList<>();

    public Nest(String name, Osterhase hase) {
        if(NAMES.contains(name)) throw new IllegalArgumentException("Name nicht eindeutig");
        NAMES.add(name);
        this.name = name;
        this.hase = hase;
        hase.registerNest(this);
    }

    public void addEi(Ei ei) {
        if(eier.size() >= 10) throw new IllegalStateException("Max 10 Eier");
        if(ei.isInNest()) throw new IllegalStateException("Ei bereits in Nest");
        eier.add(ei);
        ei.assignToNest(this);
    }

    public List<Ei> getEier() {
        return Collections.unmodifiableList(eier);
    }
}