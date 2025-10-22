package einheit_03.haustier;

public class MainHund {

    public static void main(String[] args) {

        Hund myHund = new Hund("Pluto", Rasse.DACHSHUND);
        System.out.println(myHund.toString());


        Hund yourHund = new Hund("Peter", Rasse.PIKACHU);
        System.out.println(yourHund.toString());

        Hund.wievieleHundeGibtes();

        Hund seinHund = new Hund("Sebastian", Rasse.CHIWAUWAU);





    }

}
