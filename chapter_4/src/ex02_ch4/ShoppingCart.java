package ex02_ch4;

public class ShoppingCart
{
    public static void main(String[] args)
    {
        String custName = "Rourke";
        String itemDesc = "BMW G80's";
        String message = custName + " would love to buy " + itemDesc + " !";

        double price = 1_999_900.00;
        double tax = 1.14;
        int quantity = 2;
        double total;

        message = custName + " would love to buy " + quantity + " " + itemDesc + " !";

        System.out.println(message);

        total = quantity * price * tax;

        String totalMsg = "The total price of your purchase is R" + total;
        System.out.println(totalMsg);

    }
}
