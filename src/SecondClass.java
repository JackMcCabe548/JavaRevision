public class SecondClass {

    public static String FirstName;
    public static String LastName;

    public static String FavouriteColour;
    public static int FavouriteNum;

    //SecondClass() {}
    public SecondClass(String newFirstName, String newLastName) { // Constructor
        FirstName = newFirstName;
        LastName = newLastName;
        }

        // New methods
        public static void setFavouriteColour(String newColour){
            FavouriteColour = newColour;
            }
        public static void setFavouriteNum (int newNum) {
            FavouriteNum = newNum;
            }

} // end of class
