import java.util.Arrays;

public class HQ {

    static int [] Grocery  = {10, 10, 10, 10}; // Array of length 2

    public static void main (String [] args) {

// ThirdClass code//
        Newton T1 = new Newton("newton", 25); // Create object which calls constructor with 2 arguments
        Newton T2 = new Newton("bisection", 8);

        System.out.println(); // Makes space

//Fourth class code//
//FifthClass code//
//SixthClass code//

        // POLYMORPHIC ARGUMENTS //
        Assembler obj = new Assembler();
        Super A = new Age();
        Super B = new Name();

        obj.Together(A);
        obj.Together(B);

        obj.printer();
    }

}
