package ex03_ch7;

public class ShoppingCart {
    public static void main(String[] args) {
        int int1;

        //  Declare and initialize variables of type long, float, and char.
        long long1 = 11_235_789_431L;
        float float1 = 10.69F;
        char char1 = 'R';

        // Print the long variable.
        System.out.println("This is a number representing a Long data type: " + long1);

        // Assign the long to the int and print the int variable.
        int1 = (int) long1;
        System.out.println("The previous Long data type is casted to an Integer: " + int1);

        /* The change after casting is due to truncation, a long value can hold up to 64 bits of data, whereas an
           Integer can only hold up to 32 bits, this will cause the remaining bits to be discarded after the conversion.
        */

    }
}
