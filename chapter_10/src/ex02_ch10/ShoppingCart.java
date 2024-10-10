package ex02_ch10;

public class ShoppingCart {
    public static void main(String[] args) {
        Order order = new Order("Rourke Scott", 800, "SD", Order.CORP);
        System.out.println("Discount is: " + order.getDiscount());
    }
}
