package stuetz.eins;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
       Kunde tempKunde =  Kunde.createCustomer("Heinz", 11);
        Kunde te =  Kunde.createCustomer("dd", 11);
        Kunde tee =  Kunde.createCustomer("ss", 11);
        tee.upgradeCustomer();
        tee.upgradeCustomer();

       if(tempKunde != null) {
           tempKunde.upgradeCustomer();
           tempKunde.upgradeCustomer();
           tempKunde.upgradeCustomer();
           System.out.println(tempKunde.toString());
       }
   // t1 div. Kunden in DB
        System.out.println("*".repeat(20));
       ArrayList<Kunde> selection =  Kunde.returnListByStatus(Segment.HIGH);
       selection.forEach(System.out::println);




    }




}
