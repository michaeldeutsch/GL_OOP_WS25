package einheit_08.osterhase.model;

import java.util.*;

public class Osterhase {
    private static int NEXT_ID = 1;
    private final int id = NEXT_ID++;
    private final String name;
    private final List<Nest> nester = new ArrayList<>();

    public Osterhase(String name) { this.name = name; }
    public int getId() { return id; }
    public String getName() { return name; }

    void registerNest(Nest n) { nester.add(n); }
    public int getAnzahlBefuellterNester() { return nester.size(); }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{"+id+", "+name+"}";
    }
}