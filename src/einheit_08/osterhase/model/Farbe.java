package einheit_08.osterhase.model;

public enum Farbe {
    BLAU(1), GRUEN(23), GELB(3), ROT(4);
    private final int code;
    Farbe(int code) { this.code = code; }
    public int getCode() { return code; }
}