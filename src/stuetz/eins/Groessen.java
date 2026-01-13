package stuetz.eins;

public enum Groessen {


    MINI (10,20), MIDI (20, 30), MAXI (30, 40);
    private int min;
    private int max;
    private Groessen(int min, int max) {
        this.min = min;
    }
    public int getMin() {
        return min;
    }

    }
