package einheit_03.dating;

public class MainDating {

    public static void main(String[] args) {



        Mann meinMann = new Mann("Fritz");
        Frau meineFrau = new Frau("Susi");
        Frau sideFrau = new Frau("Peter");
        Mann sidePartner = new Mann("John");

        meinMann.addPartner(meineFrau);
        meinMann.removePartner();

        meinMann.addPartner(sideFrau);

        System.out.println(meinMann.toString());



    }
}
