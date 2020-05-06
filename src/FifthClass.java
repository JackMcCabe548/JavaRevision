import java.util.Scanner;

public class FifthClass {

    private String Name;
    private int Weight;

    FifthClass(String NewName, int NewWeight){
        Name = NewName;
        Weight = NewWeight;
        setName(NewName);
        setWeight(NewWeight);
        System.out.println(this);
    }

    public String getName() {
        return Name;
    }

    public int getWeight() {
        return Weight;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public String toString(){
        System.out.println("Your data shows name: " + getName() + " Weight: " + getWeight());
        return null;
    }

}
