package einheit_04;

import java.util.ArrayList;

public class Mehrfach {


    public static void main(String[] args) {

    ArrayList<String> meineListe = new ArrayList<>();

    meineListe.add("Michael");
    meineListe.add("Peter");
        System.out.println("Aktuelle Größe: " + meineListe.size());
    meineListe.add("Paul");
    meineListe.add("Lisa");
        System.out.println("Aktuelle Größe: " + meineListe.size());
        // t1

        meineListe.remove("Paul");

    for (String name : meineListe){
        System.out.println(name);
    }






    }
}
