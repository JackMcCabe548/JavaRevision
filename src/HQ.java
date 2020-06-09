
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
            RevisionTwo AA = new RevisionTwo("JACK"); // Calls constructor with one argument
            RevisionTwo BB = new RevisionTwo("JOHN"); // Calls constructor with one argument

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
        CollectorClass Z = new CollectorClass();

        CollectedData A = new FirstName();
        CollectedData B = new LastName();

        Z.Creator(A);
        Z.Creator(B);
        System.out.println("Values are: ");
        Z.UserProfile();
        System.out.println();
        HQ g = new HQ();
        System.out.println(g.anus(7));

    }

    public long anus (long ans){ // Recusrion method
            if (ans <= 1) {
                    return 1;
            }
            else
                    return ans* anus(ans-1);
    }

}