package einheit_04.hotel;

import java.util.ArrayList;

public class Hotel {

    static ArrayList<Hotel> ALL_HOTELS = new ArrayList<Hotel>(); // Gesamtmenge als Objekt
    static ArrayList<String> HOTEL_NAMES = new ArrayList<String>(); // Gesamtmenge, aber nur der Hotelname
    private String name;

    public Hotel(String name) {

        if(HOTEL_NAMES.contains(name)){
            throw new IllegalArgumentException("Name already exists");
        }

        this.name = name;
        ALL_HOTELS.add(this);
        HOTEL_NAMES.add(name);
    }

    @Override
    public String toString() {
        return "Hotelname " + name;
    }

    public static void showHotels(){
        ALL_HOTELS.forEach(System.out::println);
    }

}
