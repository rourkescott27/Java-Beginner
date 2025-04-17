package classWork;

import org.w3c.dom.ls.LSOutput;

public class ClassWork {
    public static void main ( String[] args ) {
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();

//        Changing certain field values
        customer1.age = 40;
        customer2.name = "Duke";

//        Accessing a different class method
        customer1.cart.cancel();

//        Calling the displayCustomer method on the object
        customer1.displayCustomer();
        customer2.displayCustomer();
    }
}

    class Customer {
        public String name = "Junior Duke";
        public Cart cart = new Cart();
        public int custID = 1025;
        public String address;
        public int orderNum;
        public int age;

        public void displayCustomer () {
            System.out.println("Customer: " + name);
        }


    class Cart {
        public Item[] items;
        public String date;
        public double total;

        public void cancel () {
            System.out.println("Cancelling order....");
        }

    }

    class Item {

    }





}


