import java.util.*;

public class Assembler {

    // Polymorphic array //
    private Super [] CollectionArray = new Super [2]; // Array of superclass type

    private List <Super> EndLessList = new ArrayList<>(); // ArrayList

    private List <Super> BigList = new LinkedList <> ();// Linked List

    private static int i = 0;

    public void Add(Super x) {
        if (i < CollectionArray.length){
            CollectionArray[i] = x;
            System.out.println("Object added at position: " + i);
            i++;
            }
    }

    public void asList () {
        List <Super> BigList = new LinkedList <> (Arrays.asList(CollectionArray)); // Converts Array to Linked List

        for (Super M : BigList) { // Prints LinkedList
                M.Data();
            }
        System.out.println("Spacings");
        }


     public void asArray () {
         List <Super> EndLessList = new ArrayList<>(BigList);
         System.out.println(EndLessList);

         for (Super V : EndLessList) {
             V.Data();
         }
         System.out.println("Spacing");

         for (i = 0; i < EndLessList.size() ; i++) {
             System.out.println(EndLessList.get(i));
         }

     }


    }

