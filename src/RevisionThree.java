import java.util.ArrayList;
import java.util.List;
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

    public void intermediate () {
        String [] ShoppingList = {"Eggs" , "Bread", "Milk" , "Butter"}; // Array
        List<String> List = new ArrayList<String>(); // Array list

        for (String x: ShoppingList) { // Object of array
            List.add(x); // adds the items of the array to the arrayList
        }

        for (int i = 0 ; i < List.size() ; i++) {
            System.out.println(List.get(i)); // Gets each item in arrayList from reference
        }

        String [] MoreShopping = {"Bread" , "Eggs"}; // Array
        List<String> List2 = new ArrayList<String> (); // ArrayList

        for (String y : MoreShopping) { // Enhanced for loop
            List2.add(y); // Adds array items to ArrayList
        }

    }

}