import java.util.Scanner;

public class SixClass {

    private enum ICECREAM { // ENUMERATION ACTS AS A CLASS
        VANILLA("Just like sex" , " £1.00 "),
        STRAWBERRY("Its healthy because its a fruit", " £0.90 "),
        CHOCOLATE("Kit kat", " £1.20 "),
        SALTEDCARAMEL("Basic like oreo ice cream", " £1.40 ");

        private final String Flavour;
        private final String Desc;

        ICECREAM(String NewFlavour, String Description){ // Constructor that assigns enum attributes to variables
            Flavour = NewFlavour;
            Desc = Description;
        }

        public String getFlavour() {
            return Flavour;
        }

        public String getDesc() {
            return Desc;
        }
    }

    public SixClass (String OUT){ // CONSTRUCTOR

        //System.out.println("Enter a flavour");
        //Scanner scan = new Scanner(System.in);
        //String OUT = scan.nextLine();
        ICECREAM ICE = ICECREAM.valueOf(OUT);

        //for ( ICECREAM C: ICE.values() ){
        //    System.out.printf("%s\t%s\t%s\n,", C , C.getFlavour(), C.getDesc()); // FOR LOOPING THROUGH ALL ENUM VALUES
        //}
        System.out.println(ICE.getDesc() + "\t" + ICE.getFlavour());


    }


}