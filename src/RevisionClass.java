
public class RevisionClass { //Class

    private enum PLANETS { // ENUMERATION CLASS
        MERCURY, VENUS, EARTH
    }

    private static String UserInput;

    RevisionClass(String Input) { // CONSTRUCTOR
        setUserInput(Input);
    }

    public static void setUserInput(String Input) { // SETTER
        UserInput = Input;

        PLANETS P = PLANETS.valueOf(Input); // Turns enum into object
        switch (P){
            case MERCURY:
                System.out.println("You chose Mercury");
                break;
            case VENUS:
                System.out.println("you chose Venus");
                break;
            case EARTH:
                System.out.println("You chose Earth");
                break;
        }
    }

}