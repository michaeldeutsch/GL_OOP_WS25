package einheit_01.wiederholung;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Wiederholung_Do {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File(".\\src\\einheit_01\\namen.txt");

        Scanner sc = new Scanner(file);
        int rowCount = 0;

        while (sc.hasNextLine()){
            rowCount++;
            String line = sc.nextLine();
            String[] words = line.split(",");
            //System.out.println(Arrays.toString(words));
            System.out.println("Namen: " + words[2]);

        }

        System.out.println("Anzahl Zeilen: " + rowCount);
    }
}
