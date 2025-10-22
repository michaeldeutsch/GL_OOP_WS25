package einheit_03.restaurant;

public class MainRestaurant {
    public static void main(String[] args) {
        Restaurant myRestaurant = new Restaurant("Mayer");

        myRestaurant.setGf("Fritz");
        System.out.println(myRestaurant.toString());
        System.out.println(myRestaurant.getGf());
    }
}
