import java.util.Arrays;
import java.util.Scanner;
// Array adding class //
public class SecondClass { // Getters and setters

    private int [] Y ;

    SecondClass(int [] NEWY){ // Constructor with array argument
        //Y = NEWY;
        setY(NEWY); // Assigns array to SETTER method
        System.out.println(this); // Calls to string method
    }

    public int[] getY() { // GETTER
        System.out.println(Arrays.toString(Y)); // When called outputs the string
        return Y;
    } // end of method

    public void setY(int [] NEWY) { // SETTER
        Y = NEWY;
        try {
            for (int i = 0; i < NEWY.length; i++) {
                NEWY[i] = NEWY[i] + 10;
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    } // end of method

    public String toString(){
        getY();
        return null;
    }

} // end of class
