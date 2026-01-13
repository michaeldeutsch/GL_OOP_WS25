package stuetz.eins;

public class Utility {

    private static int MIN_BALANCE = 1;
    public static boolean isPositiveBalance(int guthaben) {
        return guthaben < MIN_BALANCE; // 11 > 0 = true
    }

}
