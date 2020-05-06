public class ThirdClass { //Class

    private String Fruit;

    public ThirdClass (String Carrot) { // One argument constructor

        setFruit(Carrot); // ASSIGNS VALUE TO FRUIT VAR
        System.out.println(this); // Calls toString method which class getter
    }

    public String getFruit() {
        return Fruit;
    }

    public void setFruit(String NewFruit) {
        Fruit = NewFruit;
    }

    public String toString() {

        System.out.println("The veg is " + getFruit());

        return null;
    }

} // end of class
