package ex01_ch7;
/*
Exercise 7-1
1. Use the indexOf method to get the index for the space character (" ")
     within custName.  Assign it to spaceIdx.
2. Use the substring method and the spaceIdx to get the first name
     portion of custName.  Assign it to firstName.  Print firstName.
*/

public class ShoppingCart {
    public static void main (String[] args){
        String custName = "Rourke Scott";
        String firstName;
        int spaceIdx;

        // Get the index of the space character (" ") in custName.
        spaceIdx = custName.indexOf(" ");
        System.out.println("The index of the space is: " + spaceIdx);

        // Use the substring method parse out the first name and print it.
        firstName = custName.substring(0, spaceIdx);
        System.out.println("The first name is: " + firstName);

    }
}

/* Class exercises
String phoneNum = "404-543-2345";
        int idx1 = phoneNum.indexOf("-");
        System.out.println("Index of the first dash: " + idx1);

        int idx2 = phoneNum.indexOf("-", idx1 + 1);
        System.out.println("Index of the second dash: " + idx2);

        StringBuilder mySb = new StringBuilder("Hello");
        mySb.append(" World!");
        System.out.println(mySb);
*/