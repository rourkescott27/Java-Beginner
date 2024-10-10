package ex02_ch12;

public class Shirt extends Item {
    private char size;
    private char colourCode;

    public Shirt(double price, char size, char colourCode) {
        super("Shirt", price);
        this.size = size;
        this.colourCode = colourCode;
    }

    public void display() {
        super.display();
        System.out.println("\tSize: " + size);
        System.out.println("\tColour Code: " + colourCode);
    }
}
