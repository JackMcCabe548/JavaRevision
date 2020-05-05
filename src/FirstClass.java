import java.util.Scanner;

public class FirstClass {

    public static void main (String [] args) {

// SecondClass code
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a num");
        int value = scan.nextInt();
        SecondClass s = new SecondClass(); // create object
        s.setFavouriteNum(value);
        int setFavouriteNum = s.getFavouriteNum();
        System.out.println(setFavouriteNum);

// ThirdClass code
// Fast Constructor instantiating objects
        System.out.print("Newton Raphson answer is: ");
        ThirdClass F = new ThirdClass( "newton" , 10 ); // Object with 2 arguments


//Fourth class code
// Understanding Getters and Setters


    }
}
