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
        ThirdClass T = new ThirdClass("Jack", 'L'); // Assign values
        System.out.println("Name" + "\t" + "Clothing"); // Making a table
        System.out.println(T.FirstName + "\t" + T.Size); // Call variables

    }
}
