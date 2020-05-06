public class ThirdClass { //Class

    // Vairables for second constructor
    private static String FinalAns;
    private static int Numberinput;

     ThirdClass(String NewFinalAns, int NewInput) { // Constructor class with two arguments

        try { // Attempts to execute code unless errors occur

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
            while (FinalAns.equals ("newton") || FinalAns.equals("bisection") && Numberinput > 0 && Numberinput <= 10); // While correct inputs are entered the do loops
        }
        catch (Exception e) { // code prevents typing in the wrong primitives
            System.out.println(" Error type: " + e);
        }

    } // end of method

} // end of class
