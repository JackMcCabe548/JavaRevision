public class SeventhClass {

    private static String Name;

    public SeventhClass(){}
    public SeventhClass(String NewName){
        setName(NewName);
        System.out.println(this);
    }

    public static String getName() {
        return Name;
    }

    public static void setName(String NewName) {
        Name = NewName;
    }

    public String toString(){
        return "Your name is " + getName();
    }

    public void Inhale (SixthClass x){
        x.Aplha();
    }
}
