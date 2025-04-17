package ClassWork;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;

public class ClassWork {
    public static void main ( String[] args ) {
        // UnsupportedTemporalTypeException error below
        /** LocalDate myDate = LocalDate.now();
         System.out.println("Today's date is " + myDate);

         LocalDate newDate = myDate.minusMonths(10);
         System.out.println("The new date is " + newDate);

         JapaneseDate jDate = JapaneseDate.from(myDate);
         System.out.println("Today's date in Japan is " + jDate);

         LocalDate today = LocalDate.now();
         System.out.println("Today's date(without formatting) is " + today);

         String sDate = today.format(DateTimeFormatter.ISO_DATE_TIME);
         System.out.println("Today's date (in ISO_DATE_TIME format) is " + sDate);

         String fDate = today.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
         System.out.println("Today's date (in MEDIUM format) is " + fDate);**/

        //------2D Arrays------//
        /** int[][] yearlySales;
         yearlySales = new int[5][4];
         yearlySales[0][0] = 1000;
         yearlySales[0][1] = 1500;
         yearlySales[0][2] = 2000;
         yearlySales[0][3] = 2500;

         yearlySales[1][0] = 3000;
         yearlySales[1][1] = 3500;
         yearlySales[1][2] = 4000;
         yearlySales[1][3] = 4500;

         yearlySales[2][0] = 5000;
         yearlySales[2][1] = 5500;
         yearlySales[2][2] = 6000;
         yearlySales[2][3] = 6500;

         yearlySales[3][0] = 7000;
         yearlySales[3][1] = 7500;
         yearlySales[3][2] = 8000;
         yearlySales[3][3] = 8500;

         yearlySales[4][0] = 9000;
         yearlySales[4][1] = 9500;
         yearlySales[4][2] = 10000;
         yearlySales[4][3] = 10500;

         for (int i = 0; i < yearlySales.length; i++) {
         for (int j = 0; j < yearlySales[i].length; j++) {
         System.out.print(yearlySales[i][j] + "\t"); // \t adds a tab space for formatting
         }
         System.out.println(); // Move to the next line after each row
         }**/

        //-----While Loop-----//
        /**System.out.println("/*");
         int counter = 0;
         while(counter < 5){
         System.out.println(" *");
         counter++;
         }
         System.out.println("/*");**/

        //-----For Loop-----//
        /**System.out.println("For Loop");
         for (int i = 0; i < 5; i++) {
         System.out.println("\ti = " + i + ";");
         }**/
        //----- Converting to a While Loop-----/
        /**System.out.println("\n While Loop");
         int i = 0;
         while(i < 5){
         System.out.println("\ti = " + i + ";");
         i++;
         }**/
        //-----Enhanced For-Loop-----//
        /**String[] names = {"Kafka", "Jinwoo", "Denji", "Asta"};

         for (String n : names) {
         System.out.println(n);
         }**/
//        factorial(5); //*/
//        factorial(10);

        //------Nested For-Loop-----//
        /** int h = 4, w = 10;
         for (int row = 0; row < h; row++) {
         for (int col = 0; col < w; col++) {
         System.out.println("@");
         }
         System.out.println();
         } **/

        //-----Nested While-Loop-----/
        /**String name = "Lenny";
         String guess = " ";
         int attempts = 0;

         while(!guess.equalsIgnoreCase(name)){
         guess = "";
         while(guess.length() < name.length()){
         char asciiChar = (char)(Math.random()*26 + 97);
         guess += asciiChar;
         }
         attempts++;
         }
         System.out.println(name + " found after " + attempts);**/

        //-----Processing a 2D Array-----//
        /** int sales[][] = new int[3][4];
         int[][] salesArray = initArray(sales);

         System.out.println("Yearly sales by quarter beginning 2010:");
         for (int i = 0; i < sales.length; i++) {
         for (int j = 0; j < sales[i].length; j++) {
         System.out.println("\tQ" + (j + i) + " " + sales[i][j]);
         }
         System.out.println();
         }**/

        //-----Working with an ArrayList-----//
        ArrayList<String> names;
        names = new ArrayList<>();

        names.add("Jamie");
        names.add("Gustav");
        names.add("Alisa");
        names.add("Jose");
        names.add(2, "Prashant");

        names.remove(0);
        names.remove(names.size() - 1);
        names.remove("Gustav");

        System.out.println(names);
    }
    //-----Static Methods-----//
    //-----Do-While Loop to find the Factorial-----/*/

    /**
     * static void factorial(int target) {
     * int save = target;
     * int fact = 1;
     * do {
     * fact *= target--;
     * } while (target > 0);
     * System.out.println("Factorial for " +  save + ": " + fact);
     * }
     **/

    //-----Processing a 2D Array(Method)-----//
    /** public static int[][] initArray ( int[][] salesArray ) {
     int salesAmount = 100;
     for (int outer = 0; outer < 3; outer++) {
     for (int inner = 0; inner < 4; inner++) {
     salesArray[outer][inner] = salesAmount++;
     }
     }
     return salesArray;
     }**/

}
