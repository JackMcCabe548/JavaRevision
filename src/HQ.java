
public class HQ {

    public static void main (String [] args) {

        // Revision
            Revision a = new Revision(); // Constructor with zero arguments
            a.Searching();
            a.Making("RANDOM SHIT"); // Argument is the File Name
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

            R.Test();

            System.out.println();

         // Cookie
            Cookie Cook = new Cookie(67);

            System.out.println();

         //THREADDDD
            Thread T1 = new Thread(new THREADDDD("Timer", 100)); // Creates object of Thread
            Thread T2 = new Thread(new THREADDDD("Timer 2", 99)); // Creates object of Thread (Second item finishes first)

            T1.start();
            T2.start();

        System.out.println(); // Spacing

        // POLYMORPHIC ARGUMENTS //
        CollectorClass Z = new CollectorClass();

        CollectedData A = new FirstName(); // Object of subclass
        CollectedData B = new LastName(); // Object of subclass

        Z.Creator(A);
        Z.Creator(B);
        System.out.println("Values are: ");
        Z.UserProfile(); // Print method
        System.out.println(); // Spacing


        System.out.println(anus(5)); // Call and print method

        System.out.println(); // Spacing

        for (int x = 0; x < 5; x++) {
            if (x == 3){
                continue; // Skips integer 5
            }
            System.out.println("The numbers are " + x);
        }

        
    }

    public static long anus (long ans){ // Recursion method
            if (ans <= 1) {
                    return 1;
            }
            else
                    return ans * anus(ans-1); // Recursion calls its own method
    }

}