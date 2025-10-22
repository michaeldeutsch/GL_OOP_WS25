package einheit_03.bank;

public class MainBank {

    public static void main(String[] args) {


        Konto myKonto = new Konto("Michael");

        System.out.println(myKonto.getInhaber());
        myKonto.setInhaber("     ");

        System.out.println(myKonto.getInhaber());


    }
}
