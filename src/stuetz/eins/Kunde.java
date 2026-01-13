package stuetz.eins;

import java.util.ArrayList;

public class Kunde {
    private static ArrayList<String> CUSTOMERS_BY_NAME = new ArrayList();
    private static ArrayList<Kunde> ALL_CUSTOMERS = new ArrayList<Kunde>();
    private String name;
    private int guthaben;
    private Segment segment;

    public Kunde(String name, int guthaben) {
        if(CUSTOMERS_BY_NAME.contains(name)){
            throw new IllegalArgumentException("Name already exists!");
        }
        if(Utility.isPositiveBalance(guthaben)){ // 11 > 0 = true
            throw new IllegalArgumentException("Guthaben darf nicht null oder negativ sein");
        }
        this.segment = Segment.LOW;
        this.name = name;
        this.guthaben = guthaben;

        CUSTOMERS_BY_NAME.add(name);
        ALL_CUSTOMERS.add(this);
    }

    public void upgradeCustomer(){
        if(Segment.LOW == this.segment){
            this.segment = Segment.MIDDLE;
            System.out.println("Upgrading customer to middle");
        }else if(Segment.MIDDLE == this.segment){
            this.segment = Segment.HIGH;
            System.out.println("Upgrading customer to high");
        }else if(Segment.HIGH == this.segment){
            System.out.println("Seniorlevel bereits erreicht");
        }
    }


    public static Kunde createCustomer(String heinz, int guthaben) {
        try {
            Kunde meinKunde = new Kunde(heinz,guthaben);
            System.out.println(meinKunde);
            return meinKunde;
        } catch (IllegalArgumentException e) {
            System.err.println(e.getLocalizedMessage());
        }
        return null;
    }

    public static ArrayList<Kunde> returnListByStatus(Segment segment) {
    ArrayList<Kunde> list = new ArrayList<>();

    for(Kunde kunde : ALL_CUSTOMERS){
        if(segment.equals(kunde.segment)){
            list.add(kunde);
        }
    }


   return list;
    }



    @Override
    public String toString() {
        return "Kunde{" +
                "name='" + name + '\'' +
                ", guthaben=" + guthaben +
                ", segment=" + segment +
                '}';
    }
}
