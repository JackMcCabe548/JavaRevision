import java.util.Scanner;

public class FirstClass {

    public static void main (String [] args) {

// slow instantiating objects
        SecondClass s = new SecondClass();
        s.setFavouriteColour("Purple"); // setting attribute values
        s.setFavouriteNum(2); // Setting values attribute
        System.out.println(s.FavouriteColour);
        System.out.println(s.FavouriteNum);

// Fast Constructor instantiating objects
        ThirdClass FT = new ThirdClass('L');
        System.out.println(FT.JackSize);

        ThirdClass F = new ThirdClass( "newton" , 600 ); // Object with 2 arguments

    }
}
