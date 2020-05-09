import java.util.Scanner;

public class SixClass {

    private enum ICECREAM { // ENUMERATION
        VANILLA, STRAWBERRY, CHOCOLATE, SALTEDCARAMEL, MINT, TOFFEE
    }

    private String Flavour;

    public SixClass(){ // METHOD

        System.out.println("Enter a flavour: ");
        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();
        Flavour = answer;
        System.out.println("The flavours available are " + java.util.Arrays.asList(SixClass.ICECREAM.values()) ); // Prints enumeration values
        setFlavour(answer); // Sets constructor value to user input
        System.out.println(this); // calls toString method
    }

    public String getFlavour() { // GETTER
        return Flavour;
    }

    public void setFlavour(String NewFlavour) { // SETTER
        Flavour = NewFlavour;

        ICECREAM i = ICECREAM.valueOf(NewFlavour); // Creates object with value user enters

        switch (i) {
            case MINT:
                System.out.println("You minty boi");
                break;
            case TOFFEE:
                System.out.println("Toffee is noice");
                break;
            case VANILLA:
                System.out.println("Just like sex");
                break;
            case CHOCOLATE:
                System.out.println("Kit kat");
                break;
            case SALTEDCARAMEL:
                System.out.println("Basic like oreo ice cream");
                break;
            case STRAWBERRY:
                System.out.println("Its healthy because its a fruit");
                break;
            }
        }

    public String toString(){
        System.out.println("Flavour chosen is " + getFlavour());
        return null;
    }

}