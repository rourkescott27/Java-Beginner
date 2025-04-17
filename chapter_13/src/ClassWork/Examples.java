package ClassWork;

import java.util.*;

public class Examples {
    public static void main ( String[] args ) {
        String[] nums = {"one", "two", "three"};
        ArrayList <String> myArrayList = new ArrayList(Arrays.asList(nums));

        String[] names = {"Ned", "Fred", "Jessie", "Alice", "Rick" };
        List <String> myList = new ArrayList(Arrays.asList(names));

        for(String s : myList){
            System.out.print(s.toUpperCase() + ", ");
        }
        System.out.println("After for-loop: " + myList);

        myList.replaceAll(s -> s.toUpperCase());
        System.out.println("List.replaceAll: " + myList);
    }
}
