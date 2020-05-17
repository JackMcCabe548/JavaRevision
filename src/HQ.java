import java.util.Arrays;

public class HQ {

    static int [] Grocery  = {10, 10, 10, 10}; // Array of length 2

    public static void main (String [] args) {

// ThirdClass code//
        GET T1 = new GET("newton", 25); // Create object which calls constructor with 2 arguments
        GET T2 = new GET("bisection", 8);

        System.out.println(); // Makes space

//Fourth class code//
//FifthClass code//
//SixthClass code//

        // POLYMORPHIC ARRAY //
        //AnimalKingdom [] MultiClassArray = new  AnimalKingdom[2]; // An array of superclass type that can hold objects of subclass types
        //MultiClassArray[0] = new Dog(); // assigns Array position 0 to FourthClass method
        //MultiClassArray[1] = new Cat(); // assigns Array position 1 to FourthClass method

        //for (int i = 0; i < MultiClassArray.length; i++) { // For loop for assigning methods to positions in array
        //    MultiClassArray[i].Eat(); // Assigns the value of the method in FourthClass/ FifthClass into the polymprhic array
        //}
        System.out.println(); // Makes space

        // POLYMORPHIC ARGUMENTS //
        Assembler obj = new Assembler();
        Super A = new Age();
        Super B = new Name();

        obj.Together(A);
        obj.Together(B);
    }

}
