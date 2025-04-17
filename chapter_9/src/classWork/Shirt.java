package classWork;

public class Shirt {

    private int shirtID = 0;
    private String desc = "-description required-";
    private char colourCode = 'U';
    private double price = 0.0;

    // No arguments
    public Shirt(){
        setColourCode('U');
    }

    // One argument
    public Shirt(char colourCode){
        setColourCode(colourCode);
    }

    // Two arguments
    public Shirt(char colourCode, double price){
        this(colourCode);
        setPrice(price);
    }

    // Three arguments
    public Shirt(String desc, char colourCode, double price){
        setDesc(desc);
        setPrice(price);
        setColourCode(colourCode);
    }

    public char getColourCode () {
        return colourCode;
    }

    public void setColourCode (char newCode) {

        if(newCode == 'R') {
            colourCode = newCode;
            return;
        }
        if(newCode == 'G') {
            colourCode = newCode;
            return;
        }
        if(newCode == 'B') {
            colourCode = newCode;
            return;
        }
        System.out.println("Invalid colourCode. Use R, G or B");
    }

    public double getPrice () {
        return price;
    }

    public void setPrice (double price) {
        this.price = price;
    }

    public String getDesc(){
        return desc;
    }

    public void setDesc(String desc){
        this.desc = desc;
    }
}
