public class Carnivore {

    private AnimalKingdom [] ArrayObj = new AnimalKingdom[5]; // Array of AnimalKingdom type
    private int i = 0;

    //public void Inhale (AnimalKingdom Y){ // method with Sixthclass object as parameter
    //    Y.Eat();
    //}
    public void add(AnimalKingdom Y){ // Takes animal kingdom object as parameter
        if (i < ArrayObj.length){ // Ensures Array has spaces for objects
            ArrayObj[i] = Y; // Adds object at given place in array
            System.out.println("Object added at position " + i + " of type " + ArrayObj[i].toString());

            i++; // Increment
        }
    }

}
