package einheit_02.schueler;

public class RunApplication {

    public static void main(String[] args) {

        Schueler ersterSchueler = new Schueler("Michael", Geschlecht.MAENNLICH);
        System.out.println(ersterSchueler.toString());

        Schueler zweiterSchueler = new Schueler("Peter", Geschlecht.WEIBLICH);
        System.out.println(zweiterSchueler.toString());

        Schueler dritterSchueler = new Schueler("Paul", Geschlecht.DIVERS);
        System.out.println(dritterSchueler.toString());

    }
}
