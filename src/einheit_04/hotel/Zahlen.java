package einheit_04.hotel;

import java.util.Scanner;

public class Zahlen {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte echte Zahl eingeben ");

        try {
            int zahl =  scanner.nextInt();

            System.out.println(zahl);


        } catch (Exception e) {
            System.err.println("Das war keine echte Zahl");
        }

        System.out.println("ENDE");
    }



}
