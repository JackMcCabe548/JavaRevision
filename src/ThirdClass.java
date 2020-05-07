import java.util.Arrays;

public class ThirdClass { //Class

    private static String FinalAns;
    private static int NumberInput;

    ThirdClass(String NewFinalAns, int NewInput) { // Constructor class with two arguments

        // Puts constructor inputs through setters
        setNumberinput(NewInput);
        setFinalAns(NewFinalAns);
        System.out.println(this);
    }

    public static void setNumberinput(int NewInput) { // SETTER


        if (NumberInput > 0 && NumberInput <= 100) {
            NumberInput = NewInput;
        }
        else {
            NumberInput = 9;
        }
    }
    public static void setFinalAns(String NewFinalAns) { // SETTER
        FinalAns = NewFinalAns;
        if (NewFinalAns.equals ("a") || FinalAns.equals("b")) {

            // NESTED IF STATEMENT
            if (NewFinalAns.equals("a") ) {
                NumberInput = NumberInput * 2;
            }
            else if (NewFinalAns.equals("b") ) {
                //FinalAns = NewFinalAns;
                NumberInput = NumberInput * 4;
            } else {
                System.out.println("Error");
                NumberInput = 0;
            }
        }
        else {
            //FinalAns = NewFinalAns;
            FinalAns.equals ("bisection");
            NumberInput = NumberInput * 4;
        }
    }
    public static String getFinalAns() { // GETTER
        return FinalAns;
    }
    public static int getNumberinput() { // GETTER
        return NumberInput;
    }

    public String toString (){ // called by this keyword
        System.out.println( "The output is: " + getNumberinput() + " Using method: " + getFinalAns());
        return null;
    }

}
