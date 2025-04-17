package classWork;

public class ClassWork {
    public static void main ( String[] args ) {

//        DIFFERENT TYPES OF VARIABLES
        String name = "Sam";
        double price = 9.99;
        boolean outOfStock = false;

//        STRING CONCATENATION
        String greet1 = "Hello";
        String greet2 = "World";
        String msg = greet1 + " " + greet2 + "!";
        System.out.println(msg);

//        INT and DOUBLE
        int quantity = 10;
//        int quantity2 = 5.5;

        double price2 = 25.99;
        double price3 = 75;
        System.out.println(price3);

//        MANIPULATING NUMBERS
        int age = 70;
        int count = 21;
        age++;
        count--;
        System.out.println(age);
        System.out.println(count);

//        OPERATOR PRECEDENCE
        int c = (((25 - 5) * 4) / (2 - 10)) + 4;
        System.out.println(c);
    }
}
