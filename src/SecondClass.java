import java.util.Scanner;

public class SecondClass { // Getters and setters

    // Average calculator
    private double input;
    private double total;
    private int i;

    // Sweetness calculator //
    private String Name;
    private double Sweetness;


    SecondClass (String NewName, double NewSweetness) { // CONSTRUCTOR METHOD
        Name = NewName;
        Sweetness= NewSweetness;

        // Maps variables to setters
        setName(NewName);
        setSweetness(NewSweetness);

        System.out.println(this); // calls the method called toString from constructor which class the GETTER methods
    }

    public void setName(String name) { // SETTER
        Name = name;
    }

    public void setSweetness(double sweetness) { // SETTER
        Sweetness = sweetness;

        if (sweetness < 5) {
            System.out.println("Trash tier sweet");
        }
        else if (sweetness > 5 && sweetness < 10){
            System.out.println("Decent sweet tbh");
        }
        else {
            System.out.println("sweet error");
            Sweetness = 0.0;
        }

    }

    public String getName() { // GETTER
        return Name;
    }

    public double getSweetness() { // GETTER
        return Sweetness;
    }

    public String toString() { // toString method
        System.out.println( "The sweet: " + getName() + "Is rated " + getSweetness() );

        return null;
    }

} // end of class
