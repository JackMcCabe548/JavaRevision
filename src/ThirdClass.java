public class ThirdClass { //Class

    // Variable for first constrctor
    public static char JackSize;

    // Vairables for second constructor
    public static String FinalAns;
    public static int Numberinput;

    public ThirdClass( char NewSize ){ // Constructor with one arguments
        JackSize = NewSize;
    }

    ThirdClass(String NewFinalAns, int NewInput) { // Constructor class with two arguments

        try { // Attempts to execute code unless errors occur

            //Scanner ans = new Scanner(System.in);
            //System.out.println("Choose your route finding method");
            //String FinalAns = ans.nextLine();
            //System.out.println("Choose starting value");
            //int input = ans.nextInt();

            FinalAns = NewFinalAns;
            Numberinput = NewInput;

            do { // Executes code while parameter is true
                if (FinalAns.equals("newton") ) {
                    Numberinput = Numberinput * 2;
                    System.out.println(Numberinput);
                    break;

                } else if (FinalAns.equals("bisection") ) {
                    Numberinput = Numberinput * 4;
                    System.out.println(Numberinput);
                    break;

                } else {
                    System.out.println("Error");
                    break;
                }
            } // End of do statement
            while (FinalAns.equals ("newton") || FinalAns.equals("bisection") && Numberinput > 0 && Numberinput <= 100); // While correct inputs are entered the do loops
        }
        catch (Exception e) { // code prevents typing in the wrong primitives
            System.out.println(" Error type: " + e);
        }

    }

}
