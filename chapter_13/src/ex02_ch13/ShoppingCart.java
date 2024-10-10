package ex02_ch13;

import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Item> items = new ArrayList<>();

    public static void main ( String[] args ) {
        ShoppingCart cart = new ShoppingCart();
        cart.fillCart();
        cart.removeItemFromCart("Trousers");
    }

    public void fillCart() {
        items.add(new Shirt(40.95,'M','R'));
        items.add(new Shirt(32.99,'M','Y'));
        items.add(new Trousers(59.99,34,'B',"Relaxed",'M'));
        items.add(new Trousers(75.50,8,'G',"Skinny",'F'));
    }

    public void removeItemFromCart(String desc) {
        items.removeIf(item -> item.getDesc().equals(desc));
        System.out.println("After removing " + desc + " from cart");
    }
}
