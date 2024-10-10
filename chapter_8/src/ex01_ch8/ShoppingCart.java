package ex01_ch8;

/*Exercise 8-1

In the ShoppingCart class:
2. Call the setColor method on item1.  If it returns true,
print out item1.color.  If it returns false, print an
invalid color message.
3. Test the method with both a valid color and an invalid one.*/

public class ShoppingCart {
    public static void main ( String[] args ) {
        Item item1 = new Item();

        if(item1.setColour(' ')){
            System.out.println(item1.colour);
        } else {
            System.out.println("Please use a valid colour code to proceed");
        }
    }
}
