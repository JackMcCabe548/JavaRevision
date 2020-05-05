public class SecondClass { // Getters and setters

    private static int FavouriteNum;

        public static void setFavouriteNum (int newNum) { // Setter method
            if( newNum < 10){
                FavouriteNum = newNum; // assigns private var to argument
            }
            else {
                System.out.println("Error");
                FavouriteNum = newNum; // assigns private var to argument
                System.out.print("Default value is:");
                FavouriteNum = 5; // Default value if criteria not met
            }

        }

        public static int getFavouriteNum() { // Getter method
            return FavouriteNum;
        }

} // end of class
