package einheit_01.wiederholung;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> namen = new ArrayList<>();

        namen.add("Michael");
        namen.add("Peter");
        namen.add("Paul");
        namen.add("Lisa");

        for (String name : namen){
            System.out.println(name);
        }
        namen.remove("Paul");

        if(namen.contains("Paul")){
            System.out.println("Paul ist in der Liste");
        }else {
            System.out.println("Paul ist nicht in der Liste");
        }

        for (String name : namen){
            System.out.println(name);
        }



    }
}
