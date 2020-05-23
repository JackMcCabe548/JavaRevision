import java.io.File;
import java.util.*;
import java.lang.*;

public class Revision { //Class

    private Scanner xx;

    public void Searching() { // Method for searching or a file

        File x = new File("D:\\IMPORT\\25_08_2019\\IMG_0434.HEIC"); // looking for file stored as object

        if (x.exists()) { // Checks if file in variable exists
            System.out.println("File " + x.getName() + " can be reached! ");
        }
        else
            System.out.println("No file found");

    }// end of method

    public void Making(String Name) { // Method for making a file

        final Formatter y; //Writing Strings to files

        try {
            y = new Formatter("D:\\"+Name+".txt"); // Creates a file with Constructor argument being the file name
            y.format("%s", "File created by Jack"); // Writes to file
            y.close(); // Closes file

            System.out.println("File created");
        }
        catch (Exception e) {
            System.out.println("You made a " + e);
        }
    }


}