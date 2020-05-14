
public class SecondClass { // Inheritance

    private String FirstName;
    private String LastName;
    private static int MemberNumber = 0; // Static variable allows variable to belong to class not object so it can be incremented

    public SecondClass(String FN, String LN) {
        FirstName = FN;
        LastName = LN;
        MemberNumber++;
        System.out.println(this);
    }

    public String getFirstName() { // GETTER
        return FirstName;
    }

    public String getLastName() { // GETTER
        return LastName;
    }

    public static int getMemberNumber() { // GETTER
        return MemberNumber;
    }

    public String toString(){ // CALLS GETTERS
        return getFirstName() + "\t" + getLastName() + "\t" + getMemberNumber();

    }




} // end of class
