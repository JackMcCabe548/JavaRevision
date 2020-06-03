
public class HQ {

    public static void main (String [] args) {

        // Revision
            Revision a = new Revision(); // Constructor with zero arguments
            a.Searching();
            a.Making("RANDOM SHIT");
            a.Reading();
            a.Attributes();

            System.out.println(); // Makes space

        // RevisionTwo
            RevisionTwo AA = new RevisionTwo("USER1"); // Calls constructor with one argument
            RevisionTwo BB = new RevisionTwo("USER2"); // Calls constructor with one argument

            System.out.println(); // Makes space

        // RevisionThree
            RevisionThree R = new RevisionThree();

            System.out.println(); // Space

            R.intermediate();

            System.out.println();

         // Cookie
            Cookie Cook = new Cookie(67);

            System.out.println();

        // POLYMORPHIC ARGUMENTS //
            Assembler obj = new Assembler(); // Class with method that takes superclass object

            Super B = new FirstName(); // Subclass of Super
            FirstName C = new LastName(); // Subclass of FirstName

            obj.Add(B); // add object of class to array
            obj.Add(C); // add object of class to array

            System.out.println(); // Spacing

            obj.PrintMe();
            System.out.println();
            obj.asList();
            System.out.println();
            obj.asArray();

            System.out.println(); // Spacing

            HQ g = new HQ();
            System.out.println(g.anus(7));

    }

    public long anus (long ans){ // recusrion method
            if (ans <= 1) {
                    return 1;
            }
            else
                    return ans* anus(ans-1);
    }

}