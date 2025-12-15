package einheit_06.sidestep;

public enum Karten {

    AS(15), KOENIG(14), DAME(13), BUBE(12);

    int  value;

    Karten(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }



}
