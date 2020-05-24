import java.util.Scanner;

public class RevisionThree {

    private static int x = 1;
    Scanner in = new Scanner(System.in);

    RevisionThree() {

            do { // Executes code until while is false
            try {

                System.out.println("enter a number");
                int a = in.nextInt();
                System.out.println("enter a number");
                int b = in.nextInt();
                int c = a / b;
                System.out.println("The answer is " + c);
                x = 2;

                }
            catch (Exception e) { // catches mistakes made
                System.out.println("You cant do that");
                }
            }while(x == 1); // repeates while number hasnt changed //

    }

}