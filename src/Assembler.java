import java.util.Arrays;

public class Assembler {

    // Polymorphic array //
    private Super [] CollectionArray = new Super [2]; // Array of superclass type
    private static int i = 0;

    public void Add(Super x) {
        if (i < CollectionArray.length){
            CollectionArray[i] = x;
            System.out.println("Object added at position: " + i);
            i++;
        }

    }
    public String printer(){
        for (Super y: CollectionArray) { // Enhanced for loop
            y.Data();
            }
        return null;
        }

   }