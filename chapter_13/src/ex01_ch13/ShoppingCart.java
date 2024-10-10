package ex01_ch13;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingCart {
    public static void main ( String[] args ) {
        String[] days = {"monday", "saturday", "tuesday", "sunday", "friday"};

        ArrayList<String> listOfDays = new ArrayList<>(Arrays.asList(days));

        for(String day : listOfDays) {
            if(day.equals("sunday")) {
                String upper = day.toUpperCase();
                System.out.println(upper);
            } else {
                System.out.println(day);
            }
        }
        System.out.println(listOfDays);
    }
}
