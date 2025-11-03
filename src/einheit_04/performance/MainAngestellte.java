package einheit_04.performance;

import java.util.ArrayList;
import java.util.Collections;

public class MainAngestellte {

    public static void main(String[] args) {

        Angestellte a = new Angestellte("Heinz", 10d);
        Angestellte b = new Angestellte("Susi", 2d);
        Angestellte c = new Angestellte("Berta", 5d);

        ArrayList<Angestellte> angestellte = new ArrayList<>();

        angestellte.add(a);
        angestellte.add(b);
        angestellte.add(c);

        Collections.sort(angestellte);

        System.out.println(angestellte);
    }
}
