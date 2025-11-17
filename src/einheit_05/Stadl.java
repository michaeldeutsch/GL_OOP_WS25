package einheit_05;

public class Stadl {

    private static int COUNTER = 1;

    final private int nr;
    Bereich bereich;
    String betreiberName;

    public Stadl(Bereich bereich, String betreiberName) {
        this.bereich = bereich;
        this.betreiberName = betreiberName;
        this.nr = this.COUNTER++;
    }

    @Override
    public String toString() {
        return "Stadl{" +
                "nr=" + nr +
                ", bereich=" + bereich +
                ", betreiberName='" + betreiberName + '\'' +
                '}';
    }
}
