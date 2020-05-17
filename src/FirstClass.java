import java.util.Arrays;

public class FirstClass {

    static int [] Grocery  = {10, 10, 10, 10}; // Array of length 2

    public static void main (String [] args) {
// SecondClass code//
        SecondClass MemberNumber1 = new SecondClass("Jack", "McCabe");
        SecondClass MemberNumber2 = new SecondClass("John", "McCabe");
        SecondClass MemberNumber3 = new SecondClass("Mich", "Vickers");
        SecondClass MemberNumber4 = new SecondClass("Stephen", "McCabe");
        System.out.println(); // Makes space
// ThirdClass code//
        ThirdClass T1 = new ThirdClass("newton", 25); // Create object which calls constructor with 2 arguments
        ThirdClass T2 = new ThirdClass("bisection", 8);
        System.out.println(); // Makes space

//Fourth class code//
//FifthClass code//
//SixthClass code//

        // POLYMORPHIC ARRAY //
        AnimalKingdom [] MultiClassArray = new  AnimalKingdom[2]; // An array of superclass type that can hold objects of subclass types
        MultiClassArray[0] = new Dog(); // assigns Array position 0 to FourthClass method
        MultiClassArray[1] = new Cat(); // assigns Array position 1 to FourthClass method

        for (int i = 0; i < MultiClassArray.length; i++) { // For loop for assigning methods to positions in array
            MultiClassArray[i].Eat(); // Assigns the value of the method in FourthClass/ FifthClass into the polymprhic array
        }
        System.out.println(); // Makes space

        // POLYMORPHIC ARGUMENTS //
        Carnivore C = new Carnivore(); // Carnivore object creation

        AnimalKingdom D = new Dog(); // Dog object of Animalkingdom type
        AnimalKingdom E = new Cat(); // Dog object of Animalkingdom type

        C.add(D); // Adds Dog object to method inside carnivore
        C.add(E); // Adds Cat object to method inside carnivore
    }

}
