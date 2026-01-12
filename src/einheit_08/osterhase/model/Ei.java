package einheit_08.osterhase.model;

import java.util.UUID;

public final class Ei {
    private final UUID id = UUID.randomUUID();
    private final Farbe farbe;
    private Nest nest;

    public Ei(Farbe farbe) { this.farbe = farbe; }

    public Farbe getFarbe() { return farbe; }
    public boolean isInNest() { return nest != null; }
    void assignToNest(Nest nest) { this.nest = nest; }

    @Override
    public String toString() {
        return "Ei{" + id + ", " + farbe + "}";
    }
}