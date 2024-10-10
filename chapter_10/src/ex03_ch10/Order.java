package ex03_ch10;

public class Order
{
    static final char CORP = 'C';
    static final char PRIVATE = 'P';
    static final char NONPROFIT = 'N';
    String name;
    String stateCode;
    double total;
    double discount;
    char custType;

    public Order ( String name, double total, String state, char custType) {
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
        switch (custType) {
            case CORP:
               discount =  (total > 500) ? 8.00 : 5.00;
               break;

            case PRIVATE:
                discount = (total > 900) ? 7.00 : 0.00;
                break;

            case NONPROFIT:
                discount = (total > 900) ? 10.00 : 8.00;
                break;
            default:
                System.out.println("Invalid custType");
        }
    }
}
