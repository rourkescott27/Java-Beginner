package classWork;

public class Item {

    private double price = 15.50;

    public void setPrice ( double price ) {
        this.price = price;
    }

    public void setPrice(Customer cust){
        if(cust.hasLoyaltyDiscount()){
            price = price * 0.85;
            System.out.println("Price with discount: R" + price);
        } else {
            System.out.println("Price without discount is: R" + price);
        }
    }
}
