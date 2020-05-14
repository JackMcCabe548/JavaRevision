import java.util.Arrays;

public class FirstClass {

    static int [] Grocery  = {10, 10, 10, 10}; // Array of length 2

    public static void main (String [] args) {
// SecondClass code
        SecondClass MemberNumber1 = new SecondClass("Jack", "McCabe");
        SecondClass MemberNumber2 = new SecondClass("John", "McCabe");
        SecondClass MemberNumber3 = new SecondClass("Mich", "Vickers");
        SecondClass MemberNumber4 = new SecondClass("Stephen", "McCabe");

// ThirdClass code
        ThirdClass T1 = new ThirdClass("newton", 25); // Create object which calls constructor with 2 arguments
        ThirdClass T2 = new ThirdClass("bisection", 8);

//Fourth class code
//FifthClass code
//SixthClass code
        // POLYMORPHIC ARRAY //
        SixthClass [] OBJEK = new  SixthClass[2]; // An array of superclass type
        OBJEK[0] = new FourthClass(); // assigns Array position 0 to FourthClass method
        OBJEK[1] = new FifthClass(); // assigns Array position 0 to FourthClass method

        for (int i = 0; i < OBJEK.length; i++) { // For loop for assigning methods to positions in array
            OBJEK[i].Aplha(); // Assigns the value of the method in FourthClass/ FifthClass into the polymprhic array
        }

        // POLYMORPHIC ARGUMENTS //
        SeventhClass j = new SeventhClass(); // class with method that contains object of superclass

        SixthClass k = new FifthClass(); // Calling subclass of superclass
        j.Inhale(k);
        SixthClass m = new FourthClass(); // Calling subclass of superclass
        j.Inhale(m);

        SeventhClass J = new SeventhClass("Jack");



    }

}
