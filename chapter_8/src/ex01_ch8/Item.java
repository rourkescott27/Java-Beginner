package ex01_ch8;
/*
In the Item class:
1. Declare a setColor method that takes a char as an argument (a color code)
and returns a boolean.
Return false if the colorCode is ' '.
Otherwise, assign the colorCode to the color field and return true.
*/

public class Item {
    char colour;

    public boolean setColour (char colourCode){
        if (colourCode == ' '){
            return false;
        }
        else {
            this.colour = colourCode;
            return true;
        }
    }
}
