package stuetz.eins;

public enum Staerke {

    DUENN(5), MITTEL (7), DICK (10);
    private final int value;
    private Staerke(int value) { this.value = value; }


    public int getValue() { return value; }
}
