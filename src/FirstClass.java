import java.util.Scanner;

public class FirstClass {

    public static void main (String [] args) {

        // Constructor object
        SecondClass s = new SecondClass("Jack", "McCabe");


        SecondClass.setFavouriteColour("Red"); // setting attribute values
        SecondClass.setFavouriteNum(6); // Setting values attribute
        System.out.println(SecondClass.FavouriteColour);
        System.out.println(SecondClass.FavouriteNum);

        //System.out.println("First class");

        Scanner ans = new Scanner(System.in);
        int UserAns = ans.nextInt();



    } // method end
} // class end
