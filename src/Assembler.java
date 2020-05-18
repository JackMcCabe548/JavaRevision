import java.util.Arrays;

public class Assembler {

    // Variables //
    private Super [] CollectionArray = new Super[2]; // Superclass array
    private static int i = 0;

    public void Add(Super x) {
        while (i < CollectionArray.length){
            CollectionArray[i] = x;
            System.out.println("Object added at position: " + i);
            i++;
        }

    }
    public String printer(){
        for (Super y: CollectionArray) {
            y.Data();
            }
        return null;
        }

   }