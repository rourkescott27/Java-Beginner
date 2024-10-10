package ex04_ch11;

import java.util.ArrayList;

public class ShoppingCart {
    public static void main ( String[] args ) {
        // Declare, instantiate, and initialize an ArrayList of Strings.  Print and test your code.
        ArrayList<String> brands = new ArrayList();
        brands.add("BMW");
        brands.add("Audi");
        brands.add("Volkswagen");
        brands.add("Honda");
        brands.add("Chevrolet");
        System.out.println("Initial - " + brands);

        // add (insert) another element at a specific index
        brands.add(4, "Toyota");
        System.out.println("After - " + brands);

        // Check for the existence of a specific String element.
        // If it exists, remove it.
        if(brands.contains("Chevrolet")) {
            brands.remove("Chevrolet");
        }
        System.out.println("Last - " + brands);
    }
}
