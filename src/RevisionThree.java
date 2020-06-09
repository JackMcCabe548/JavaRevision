import java.util.*;

public class RevisionThree {

    String [] itemList = {"Brot" , "Wasser" , "Honig" , "Melone", "Milch" , "Apfelsaft"};
    LinkedList <String> Extras = new LinkedList<>();
    LinkedList <String> Linked = new LinkedList<>();

    private static int x = 1;
    Scanner in = new Scanner(System.in);
/*
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
            }while(x == 1); // repeats while number hasn't changed //

    }
*/
    public void intermediate () {


    // ADD ARRAY ITEMS TO LINKEDLIST //
        for (String x : itemList) { // Enhanced for loop
            Linked.add(x); // Adds array items to linked list
        }

        printMe(Linked); // Calls method of print LinkedList

        System.out.println();// Spacing

        Linked.addLast("Erdbeeren"); // Add item to linked list
        Linked.addFirst("Kartoffel");
        printMe(Linked); // Calls method of print LinkedList

        System.out.println(); // Spacing

        RemoveMe(Linked , 1 , 2);
        printMe(Linked); // Calls method of print LinkedList

        Collections.sort(Linked); // Sorts Alphabetically
        //Collections.sort(Linked, Collections.reverseOrder()); // Reverse sorting
        System.out.println("Item 2 is " + Linked.get(1));
        Extras.addAll(Linked); // Add one linkedlist to another


    }

    public static void printMe (List <String> L) { // method for printing linkedlist values
        for (String y : L) {
            System.out.println(y);
        }
        System.out.println(); // Spacing

        // Alternate printing technique //
        //for (int i = 0 ; i < L.size() ; i++) {
        //    System.out.println( L.get(i));
        //}
    }
    public static void RemoveMe(List <String> L, int from , int to) {
        try {
            L.subList(from, to).clear(); // Takes portion of list entered and removes it
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

}