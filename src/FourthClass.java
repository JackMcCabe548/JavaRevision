import java.util.Scanner;

public class FourthClass { // TEST VERSION OF THIRDCLASS WITH GETTERS / SETTERS

    private static String FinalAns;
    private static int NumberInput;

    FourthClass(String NewFinalAns, int NewInput) { // Constructor class with two arguments

        // Puts constructor inputs through setters
        setNumberinput(NewInput);
        setFinalAns(NewFinalAns);
    }

    public static void setNumberinput(int numberinput) { // SETTER
        NumberInput = numberinput;

        if (NumberInput > 0 && NumberInput <= 100) {
            NumberInput = numberinput;
        }
        else {
            numberinput = 5;
            NumberInput = numberinput;
        }
    }
    public static void setFinalAns(String finalAns) { // SETTER
        FinalAns = finalAns;
        if (FinalAns.equals ("newton") || FinalAns.equals("bisection")) {


            // NESTED IF STATEMENT
            if (FinalAns.equals("newton") ) {
                //FinalAns = finalAns;
                NumberInput = NumberInput * 2;
                //System.out.println(NumberInput);

            } else if (FinalAns.equals("bisection") ) {
                //FinalAns = finalAns;
                NumberInput = NumberInput * 4;
                //System.out.println(NumberInput);

            } else {
                System.out.println("Error");
            }
        }
        else {
            FinalAns = finalAns;
            FinalAns.equals ("newton");
        }
    }
    public static String getFinalAns() { // GETTER
       return FinalAns;
    }
    public static int getNumberinput() { // GETTER
        return NumberInput;
    }

    public void out (){
        System.out.println( "The output is: " + getNumberinput() + " Using method: " + getFinalAns());
    }

}
