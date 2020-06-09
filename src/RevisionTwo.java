
public class RevisionTwo {

   private enum Names {
       JACK("McCabe ", 21),
       JOHN("McCabe ", 61),
       MICHELLE("Vickers ", 49),
       PAMELA("Vickers ", 81),
       STEVE("McCabe ", 60),
       STEPHEN("McCabe ", 29);

       private String Last;
       private int Age; // for enum attribute

       Names (String LastName ,int Number) { // Enum Constructor
            Last = LastName;
            Age = Number;
       }
       public String getLastName() { //Getter
           return Last;
       }

       public int getAge() { // Getter
           return Age;
       }
   }

   public RevisionTwo(String Initial) { // Constructor

       Names N  = Names.valueOf(Initial); // Create object of enum
       System.out.println(N.getLastName() + N.getAge());
   }

}
