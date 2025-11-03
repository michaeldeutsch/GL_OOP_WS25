package einheit_04.hotel;

public class MainHotel {

    public static void main(String[] args) {




        try {
            Hotel h1 = new Hotel("One");
            Hotel h2 =  new Hotel("One"); // Ratte

        }catch (Exception e){
            System.err.println(e.getMessage());
        }


        Hotel h3 =  new Hotel("Three");


        Hotel.showHotels();


    }
}
