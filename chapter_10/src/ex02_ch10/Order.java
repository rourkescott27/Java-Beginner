package ex02_ch10;

public class Order {
    static final char CORP = 'C';
    static final char PRIVATE = 'P';
    static final char NONPROFIT = 'N';
    String name;
    String stateCode;
    double total;
    double discount;
    char custType;

    public Order(String name, double total, String state, char custType) {
        this.name = name;
        this.stateCode = state;
        this.total = total;
        this.custType = custType;
        calcDiscount();
    }

    public String getDiscount() {
        return Double.toString(discount) + "%";
    }

    public void calcDiscount() {
        if (custType == NONPROFIT) {
            if(total > 900){
                discount = 10.00;
            } else {
                discount = 8.00;
            }
        }
        if (custType == PRIVATE) {
            if(total > 900){
                discount = 7.00;
            } else {
                discount = 0.00;
            }
        }
        if (custType == CORP) {
            if(total > 500){
                discount = 8.00;
            }
            else {
              discount = 5.00;
            }
        }
    }
}
