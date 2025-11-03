package einheit_04.performance;

public class Angestellte implements Comparable<Angestellte> {


    String namen;
    double performanceRanking;

    public Angestellte(String namen, double performanceRanking) {
        this.namen = namen;
        this.performanceRanking = performanceRanking;
    }

    @Override
    public String toString() {
        return namen + " " + performanceRanking;
    }

    @Override
    public int compareTo(Angestellte o) {
        return this.performanceRanking > o.performanceRanking ? -1 : 1;

    }
}