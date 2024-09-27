package ex02_ch5;
/*
Exercise 5-2

1. Declare a String array and initialize it with 4 elements.
   Each element represents a different item description ("Shirt", for instance).
2. Change message to show how many items the customer wants to purchase
   (Use the length property of the items array).
3. Print just one element of the items array.
    What happens if you use index number 4?
*/
public class ShoppingCart {
    public static void main(String[] args)
    {
        String custName = "Rourke Scott";
        String message = custName + " wants to purchase a bunch of things";

        // Declare and initialize the items String array.
        String [] items = {"PC", "Headset", "Mouse", "Keyboard"};

        // Change the message to show the number of items purchased.
        message = message + " wants to purchase " + items.length + " items.";
        System.out.println(message);

        // Print an element from the items array
        System.out.println("He would love a " +items[0]);
    }
}
