package einheit_06.fahrzeuge;

public abstract class KFZ {

    private static int COUNTER = 1;
    private String id;


    public KFZ() {
        this.id = this.getPraefix() + COUNTER++;
    }

    public abstract String getPraefix();

    @Override
    public String toString() {
        return "KFZ{" +
                "id='" + id + '\'' +
                '}';
    }
}
