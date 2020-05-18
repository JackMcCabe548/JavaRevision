
public class HQ {

    public static void main (String [] args) {

// ThirdClass code//
        RevisionClass a = new RevisionClass("MERCURY");
        RevisionClass b = new RevisionClass("VENUS");

        System.out.println(); // Makes space

//Fourth class code//
//FifthClass code//
//SixthClass code//

        // POLYMORPHIC ARGUMENTS //
        Assembler obj = new Assembler();

        Super A = new Age(); // Subclass
        Super B = new FirstName(); // Subclass

        obj.Add(A);
        obj.Add(B);

        obj.printer();
    }
}