import java.util.Arrays;
import java.util.LinkedList;

public class CollectorClass {

// INITIALISE VARIABLES
    private static int i = 0;
    private static CollectedData [] CollectorArray = new CollectedData[2];
    private LinkedList <CollectedData> Linked = new LinkedList<>();


    public void Creator (CollectedData x) {
        if (i < CollectorArray.length) {
            CollectorArray[i] = x;
            System.out.println("Item added at position: " + i);
            i++; // Iterate
        }
    }

    public static void UserProfile (){
        LinkedList <CollectedData> Linked = new LinkedList<>(Arrays.asList(CollectorArray)); // Convert array to LinkedList
        for (CollectedData F : Linked) {
            F.Data();
        }
    }
}