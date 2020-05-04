import java.util.Scanner; // For getting user input

public class FirstClass {

    public static void main (String [] args) {

        Scanner ans = new Scanner(System.in);
        int UserAns = ans.nextByte();
        System.out.println("Enter your age");

        try {
            if (UserAns < 20) {
                System.out.println("You are young");
            }
            else if(UserAns > 20 && UserAns < 55) {
                System.out.println("Your are middle aged");
            }
            else {
                System.out.println("You ARE Elderly");
            }
        }
        catch (Exception e) {
            System.out.println("Error");
        }
    } // method end
} // class end
