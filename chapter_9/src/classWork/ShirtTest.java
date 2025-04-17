package classWork;

public class ShirtTest {
    public static void main(String[] args) {
        Shirt shirt1 = new Shirt();
        char colourCode;
        colourCode = shirt1.getColourCode();
        System.out.println("Get Colour - " + colourCode);

        shirt1.setColourCode('T');
        colourCode = shirt1.getColourCode();
        System.out.println("Set Colour - " + colourCode);
    }
}
