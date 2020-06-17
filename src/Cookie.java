public class Cookie {

    private static int numbres;

    Cookie(int Num) { // Constructor 
        setNumbres(Num);
        System.out.println(this); //Calls toString method
    }

    public static int getNumbres() {
        return numbres;
    }

    public static void setNumbres(int Nums) {
        numbres = Nums;

        if (numbres < 10) {
            numbres = 50;
        }
        else if (numbres > 100) {
            numbres = 55;
        }
    }

    public String toString() {
        return "The value is " + getNumbres();
    }
}
