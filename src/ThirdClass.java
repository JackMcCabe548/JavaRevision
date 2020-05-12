
public class ThirdClass { //Class

    private static String FinalAns;
    private static int NumberInput;

    private enum values { // Check input to Enumeration values
        newton, bisection
    }

    ThirdClass(String NewFinalAns, int NewInput) { // Constructor class with two arguments

        // Puts constructor inputs through setters
        setNumberinput(NewInput); // uses constructor value for setter
        setFinalAns(NewFinalAns); // uses constructor value for setter
        System.out.println(this); // calls toString method
    }

    public static void setNumberinput(int NewInput) { // SETTER
        if (NewInput > 0 && NewInput <= 100) {
            NumberInput = NewInput;
        }
        else if (NewInput > 100){
            NumberInput = NewInput;
            NumberInput = 5;
        }
    }

    public static void setFinalAns(String NewFinalAns) { // SETTER
        FinalAns = NewFinalAns;
        values v = values.valueOf(NewFinalAns); // uses constructor input which is checked by enumeration
            switch (v) { // switch/ case statement for checking constructor value
                case newton:
                    NumberInput = NumberInput * 2;
                    break;
                case bisection:
                    NumberInput = NumberInput * 4;
                    break;
                }
    }

    public static String getFinalAns() { // GETTER
        return FinalAns;
    }
    public static int getNumberInput() { // GETTER
        return NumberInput;
    }

    public String toString (){ // called by this keyword
        System.out.println( "The output is: " + getNumberInput() + " Using method: " + getFinalAns());
        return null;
    }

}