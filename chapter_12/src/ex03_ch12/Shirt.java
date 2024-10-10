package ex03_ch12;

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

    public String getColour(){
        String colour = "";
        String err = "";
        switch(colourCode){
            case 'R':
                colour = "Red";
                break;
            case 'G':
                colour = "Green";
                break;
            case 'B':
                colour = "Blue";
                break;
            case 'Y':
                colour = "Yellow";
                break;
            case 'O':
                colour = "Orange";
                break;
            default:
                colour = "Choose one of the valid colour codes before proceeding (R, G, B, Y, O).";
        }
        return colour;
    }
}
