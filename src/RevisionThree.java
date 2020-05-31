import java.util.*;

public class RevisionThree {

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

        String [] itemList = {"Bread" , "Orange juice" , "Milk" , "Butter"};
        LinkedList <String> Linked = new LinkedList<>();

        for (String x : itemList) { // Enhanced for loop
            Linked.add(x); // Adds array items to linked list
        }

        printMe(Linked); // Calls method of print LinkedList
        System.out.println();// Spacing

        Linked.add("Strawberries"); // Add item to linked list
        printMe(Linked); // Calls method of print LinkedList
        System.out.println(); // Spacing

        RemoveMe(Linked , 2 , 3);
        printMe(Linked); // Calls method of print LinkedList

    }

    public static void printMe (List <String> L) { // method for printing linkedlist values
        for (String y : L) {
            System.out.println(y);
        }
    }
    public static void RemoveMe(List <String> L, int from , int to) {
        L.subList(from, to).clear(); // Takes portion of list entered and removes it
    }



    public void LinkedListMethod () {

        LinkedList LL = new LinkedList();
        LL.addFirst("Jack"); // Adds item to first item
        LL.add("Michelle");
        LL.add("Steve");
        LL.add("Pamela");
        LL.addLast("John"); // Adds item to last position
        LL.removeFirst();

        System.out.println(LL); // Removes first item

    }

}