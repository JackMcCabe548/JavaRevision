import java.util.Scanner;

public class SeventhClass {

    private enum FOURPLANETS { // PRIVATE ENUMERATION CLASS
        MERCURY("Hot"),
        VENUS("Morning star"),
        EARTH("Home"),
        MARS("Red planet");

        private final String Desc;

        FOURPLANETS(String NewDesc){ // Enumeration Constructor which assigns private variable to enumeration ATTRIBUTE
            Desc = NewDesc;
        }
        public String getDesc() { // GETTER CALLED BY SWITCH STATEMENT
            return Desc;
        }
    }
    public SeventhClass(String PLANETANSWER){ // CONSTRUCTOR CLASS
        //System.out.println("Enter a planet");
        //Scanner Comet = new Scanner(System.in);
        //String Sun = Comet.nextLine();
        FOURPLANETS FP = FOURPLANETS.valueOf(PLANETANSWER); // Creates object for enumeration with object value instantiated

        switch(FP) {
            case MERCURY:
            case VENUS:
            case EARTH:
            case MARS:
                System.out.println(FP.getDesc());
                break;
        }
        //return null;
    }
}