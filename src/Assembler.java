import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Assembler {

    // Polymorphic array //
    private ArrayList <String> EndLessList = new ArrayList<>(); // ArrayList
    private LinkedList <Super> BigList = new LinkedList <Super> ();// Linked List
    private Super [] CollectionArray = new Super [2]; // Array of superclass type
    private static int i = 0;

    public void Add(Super x) {
        if (i < CollectionArray.length){
            CollectionArray[i] = x;
            System.out.println("Object added at position: " + i);
            i++;
            }
    }

    public void PrintMe(){ // Prints array when called
        for (Super K: CollectionArray) { // Enhanced for loop
            K.Data();
        }
    }

    public void asList () {
        LinkedList <Super> BigList = new LinkedList <Super> (Arrays.asList(CollectionArray)); // Converts Array to Linked List
        System.out.println(BigList);
    }

    public void asArray () { // Takes the Linked List and turns it back into an Array
        for (Super U : BigList) {
            EndLessList.add(BigList);
        }
    }



    }

