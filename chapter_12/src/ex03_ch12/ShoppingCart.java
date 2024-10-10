package ex03_ch12;

public class ShoppingCart {
    public static void main ( String[] args ) {
        Item i1 = new Shirt(39.99, 'L', 'G');

        i1.display();
        if(i1 instanceof Shirt) {
            String colour = ((Shirt)i1).getColour();
            System.out.println("\tColour: " + colour);
        } else {
            System.out.println("This item is not a Shirt");
        }
    }
}
