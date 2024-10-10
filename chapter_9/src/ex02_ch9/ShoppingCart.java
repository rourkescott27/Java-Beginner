package ex02_ch9;

public class ShoppingCart {
    public static void main(String[] args) {
        // Declare, instantiate, and initialize a Customer object
        Customer cust1 = new Customer("Rourke Scott", "005-68-1257");

        // Print the customer object name
        System.out.println("Customer name: " + cust1.getName());
        System.out.println("Customer SSN: " + cust1.getSsn());

    }
}
