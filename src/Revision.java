import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.lang.*;

public class Revision { //Class

    private Scanner xx; //For Reading method
    File TextNote = new File("D:\\Java notes\\Reference.txt"); // Searches for file and stores as object

    public void Searching() { // Method for searching or a file

        File x = new File("D:\\IMPORT\\25_08_2019\\IMG_0434.HEIC"); // looking for file stored as object
        if (x.exists()) { // Checks if file in variable exists
            System.out.println("File " + x.getName() + " can be reached! ");
        }
        else
            System.out.println("No file found");
    }// end of method

    public void Making(String Name) { // Method for making a file

        //final Formatter y; //Writing Strings to files
        try {
            Formatter y = new Formatter("D:\\"+Name+".txt"); // Creates a file with Constructor argument being the file name
            y.format("%s", "File created by Jack"); // Writes to file
            y.close(); // Closes file

            System.out.println("File created");
        }
        catch (Exception e) { // Checked error (User caused error)
            System.err.println("You made a " + e.getMessage());
        }
    }// end of method

    public void Reading() {
         // Search for desired file to read

        try { // Attempts to read code
            Scanner Reader = new Scanner(TextNote); // Scanner of file object
            while (Reader.hasNextLine()){ // While theres text to read prints text
                String data = Reader.nextLine(); // Import scanner to variable
                System.out.println(data); // Print output
            }
        } catch (FileNotFoundException e) { // Checked exception (User caused)
            System.err.println(e.getMessage());
        }
    }// end of method

    public String Attributes () {

        if (TextNote.exists()) {
            System.out.println("File is called: " + TextNote.getName()); // Gets file name
            System.out.println("File length is: " + TextNote.length()); // Gets file length
            System.out.println("Can this file be written  to?: " + TextNote.canWrite()); // Checks if file can be written too
            System.out.println("Can this file be read?: " + TextNote.canRead()); // Checks if file can be read
            //Y.delete(); // Deletes the file
        }
        return null;
    }

}