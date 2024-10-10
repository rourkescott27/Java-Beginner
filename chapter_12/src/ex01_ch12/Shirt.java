package ex01_ch12;

public class Shirt extends Item {
    private char size;
    private char colourCode;

    public Shirt(double price, char size, char colourCode) {
        super("Shirt", price);
        this.size = size;
        this.colourCode = colourCode;
    }
}
