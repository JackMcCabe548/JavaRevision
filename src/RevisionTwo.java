import java.io.IOException;
import java.util.Scanner;

public class RevisionTwo {

    public enum People { // Enumeration values with one argument
        USER1("JACK", "MCCABE"),
        USER2("JOHN" , "MCCABE"),
        USER3("MICHELLE" , "VICKERS");

        private String FirstName; // For Enumeration argument
        private String SecondName; //

        People(String First, String Second){ // ENUM CONSTRUCTOR: Argument variable linked to enumeration description
            FirstName = First; // Set private variable to enum description
            SecondName = Second; // Set private variable to enum description
        }

        public String getFirstName() {
            return FirstName;
        }
        public String getSecondName() {
            return SecondName;
        }
    }

    RevisionTwo(String ANS) { // CONSTRUCTOR

        People N = People.valueOf(ANS); // Object of enum value

        System.out.println("First name: " + N.getFirstName() + " Last name: " + N.getSecondName()); // Object of Enum which gets getter

    }//end of method
}
