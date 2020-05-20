import java.io.File;

public class RevisionClass { //Class

    private enum PLANETS {
        MERCURY, VENUS, EARTH
    }

    RevisionClass() {

        File x = new File("C:\\Users\\jackm\\Hello.txt"); // Stores file in object

        if (x.exists()) { // Checks if file in variable exists
            System.out.println(" File " + x.getName() + " can be reached! ");
        }
        else
            System.out.println("No file found");

    }
}