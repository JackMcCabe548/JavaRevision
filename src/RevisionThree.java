import java.util.*;

public class RevisionThree {

    private static String [] itemList = {"Brot" , "Wasser" , "Honig" , "Melone", "Milch" , "Apfelsaft"}; // String Array
    private static LinkedList <String> Linked = new LinkedList<>(); // String LinkedList

    Character [] Apple = new Character[2]; // Character array

    Character [] CHARS = {'J', 'A', 'C', 'K'};
    LinkedList <Character> LETTERS = new LinkedList<>();

    private static boolean Val = false;

    private static int x = 1;

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

            addTogether(Linked, itemList); // Adds array items to linkedlist

            printMe(Linked); // Calls method of print LinkedList

        System.out.println();// Spacing

            Linked.addLast("Erdbeeren"); // Add item to linked list
            Linked.addFirst("Kartoffel");

            printMe(Linked); // Calls method of print LinkedList

        System.out.println(); // Spacing

            RemoveMe(Linked , 1 , 2);
            printMe(Linked); // Calls method of print LinkedList

            Collections.sort(Linked); // Sorts Alphabetically
            //Collections.reverse(Linked); //Reverse order
            System.out.println("Item 2 is " + Linked.get(1));

            addTogether(LETTERS, CHARS);

            printMe(LETTERS);

            ReturnName(Linked, "Apfelsaft"); // For searching for item in LinkedList

    }

    public static <T> void addTogether (List <T> L, T [] n) { // Generic Method for Adding items from an Array to LinkedList
        for (T X : n) {
            L.add(X);
        }
    }

    public void Test () {
        LinkedList <Character> Orange = new LinkedList<Character>(Arrays.asList(Apple)); // LinkedList
        Collections.fill(Orange, 'x'); // Fills LinkedList with data
            for (Character y : Orange) {
                System.out.println(y);
            }
    }

    public static <T> void printMe (List <T> L) { // Generic method for printing linkedList values
        for (T y : L) {
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

    public static <T> void ReturnName (List <T> B, String x) {

        Iterator it = B.iterator(); // Operates through the object of list

        while(it.hasNext() && Val == false) { // while loop works while iterator has another item
            if (it.next() == x) {
                System.out.println( x + " exists ");
                Val = true; // Terminates program once element is found
            } else {
                System.out.println("Item not found");
            }

        } //whileloop

    }

}