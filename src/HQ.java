
public class HQ {

    public static void main (String [] args) {

        // Revision
            Revision a = new Revision(); // Constructor with zero arguments
            a.Searching();
            a.Making("My note");

            System.out.println(); // Makes space

        // RevisionTwo
            RevisionTwo AA = new RevisionTwo("USER1"); // Calls constructor with one argument
            RevisionTwo BB = new RevisionTwo("USER2"); // Calls constructor with one argument

            System.out.println(); // Makes space

        // POLYMORPHIC ARGUMENTS //
            Assembler obj = new Assembler(); // Class with method that takes superclass object

            Super B = new FirstName(); // Subclass of Super
            FirstName C = new LastName(); // Subclass of FirstName

            obj.Add(B); // add object of class to array
            obj.Add(C); // add object of class to array

            obj.printer(); // Prints array values

    }
}