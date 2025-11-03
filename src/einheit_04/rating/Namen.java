package einheit_04.rating;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Namen {

    public static void main(String[] args) {

        ArrayList<String> namen = new ArrayList<>();

        namen.add("michael");
        namen.add("zebra");
        namen.add("alf");
        namen.add("helmut");

       System.out.println(namen);


       ArrayList<Integer> werte = new ArrayList<>();
        werte.add(10);
        werte.add(20);
        werte.add(3);

        Collections.sort(werte);
        System.out.println(werte.getFirst());


    }


}
