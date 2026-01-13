package stuetz.eins;

import java.util.ArrayList;

public class Kunde {
    private static ArrayList<String> CUSTOMERS_BY_NAME = new ArrayList();

    private String name;
    private int guthaben;

    public Kunde(String name, int guthaben) {
        if(CUSTOMERS_BY_NAME.contains(name)){
            throw new IllegalArgumentException("Name already exists!");
        }
        if(Utility.isPositiveBalance(guthaben)){
            throw new IllegalArgumentException("Guthaben darf nicht null oder negativ sein");
        }

        this.name = name;
        this.guthaben = guthaben;

        CUSTOMERS_BY_NAME.add(name);
    }


    public static void createCustomer(String heinz) {
        try {
            Kunde meinKunde = new Kunde("Heinz");
            System.out.println(meinKunde);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getLocalizedMessage());
        }
    }
    @Override
    public String toString() {
        return "Kunde{" +
                "name='" + name + '\'' +
                '}';
    }
}
