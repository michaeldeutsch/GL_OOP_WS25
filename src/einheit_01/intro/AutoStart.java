package einheit_01.intro;

public class AutoStart {

    public static void main(String[] args) {
        Auto auto = new Auto("BMW", 100, 10000);
        System.out.println(auto.toString());

        Auto auto2 = new Auto("Audi", 100, 10000);
        System.out.println(auto2.toString());
    }
}
