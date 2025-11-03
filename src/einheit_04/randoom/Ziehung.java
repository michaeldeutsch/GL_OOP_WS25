package einheit_04.randoom;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ziehung {


    public static void main(String[] args) throws FileNotFoundException {
        String path = "namen.csv";
        Scanner input = new Scanner(new File(path));
        ArrayList<String> teilnehmer = new ArrayList<>();

        while (input.hasNextLine()) {
            String [] namen = input.nextLine().split(";");
            teilnehmer.add(namen[0] + namen[1]);
        }

        int pos = ThreadLocalRandom.current().nextInt(0, teilnehmer.size());
        System.err.println("Gewählt wurde ---> " + teilnehmer.get(pos));




    }

}
