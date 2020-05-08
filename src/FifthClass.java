import java.util.Arrays;
import java.util.Scanner;

public class FifthClass {

    enum GRAPHICSSETTING { // ENUMERATIOM CLASS FOR STORING FIXED VALUES IN THIS CASE GRAPHICS SETTINGS
        VERYLOW, LOW, MEDIUM, HIGH, VERYHIGH
        }

    public String Logic(){

        System.out.println("The Settings available are" + java.util.Arrays.asList(GRAPHICSSETTING.values())); // shows user enums available
        System.out.println("ENTER YOUR DESIRED GRAPHICS SETTING");

        Scanner scan = new Scanner(System.in); // Bring scanner in
        String output = scan.nextLine();

        GRAPHICSSETTING G = GRAPHICSSETTING.valueOf(output); // create object with value that user enters

        switch (G) {
            case VERYLOW:
                System.out.println("POTATO COMPUTER SETTINGS");
                break;
            case LOW:
                System.out.println("INTEL PENTIUM GANG");
                break;
            case MEDIUM:
                System.out.println("FRUGAL GAMER LEVEL");
                break;
            case HIGH:
                System.out.println("SPEEDY BOI");
                break;
            case VERYHIGH:
                System.out.println("BEEFY BOI BRIGADE");
                break;
            }

        return null;
    }

}
