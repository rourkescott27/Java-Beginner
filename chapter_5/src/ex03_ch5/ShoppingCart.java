package ex03_ch5;
/*
Exercise 5-3

1. Create a for loop that iterates through the items array,
     displaying each element. Precede the list of elements with
     the message, "Items purchased: ".
*/
public class ShoppingCart {
    public static void main(String[] args)
    {
        String custName = "Rourke Scott";
        String message;

        double price = 2999.99;
        int qty = 3;
        double tax = 1.04;

        String items[];
        items = new String[4];
        items[0] = "PC";
        items[1] = "Headset";
        items[2] = "Mouse";
        items[3] = "Keyboard";

        message = custName + " wants to purchase " + items.length + " items.";
        System.out.println(message);

        // Iterate through and print out the items from the items array
        System.out.println("Items bought: ");
        for(String item : items){
            System.out.print(item + ", ");
        }
    }
}
