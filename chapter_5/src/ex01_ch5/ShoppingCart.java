package ex01_ch5;

/*
Exercise 5-1:

1. Declare a boolean, outOfStock, and initialize it to true.
2. Use an if statement to test the value of quantity.
    If it is > 1, concatenate an 's' to message so that it indicates multiple items.
3. Use an if | else statement that tests the value of outOfStock.
    If true, let the user know the item is unavailable.
    If false, print the message variable, then print the total cost with tax.
4. Run with outOfStock = true and then again with outOfStock = false.
*/

public class ShoppingCart
{
    public static void main(String[] args)
    {
        String custName = "Rourke Scott";
        String itemDesc = "Car";

        double price = 104999.99;
        int qty = 2;
        double tax = 1.04;
        double total;

        String message = custName + " wants to buy " + qty + " " + itemDesc;

        // Calculating total cost
        total = (price * qty) * tax;

        // Declare outOfStock variable and initialize it
        boolean outOfStock = false;

        // Test quantity and modify message if quantity > 1.
        if(qty > 1){
//            message =  custName + " wants to buy " + qty + " " + itemDesc + "'s";
            message = message + "s";
        }

        // Test outOfStock and notify user in either case.
        if(outOfStock){
            System.out.println(itemDesc + " is currently out of stock.");
        }
        else {
            System.out.println(message);
            System.out.println("The total cost including tax is: " + total);
        }

    }
}
