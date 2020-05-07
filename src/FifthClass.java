import java.util.Scanner;

public class FifthClass {

    private int Apple;

    FifthClass(int NewApple){
        Apple = NewApple;
        setApple(Apple);
        System.out.println(this);
    }

    public int getApple() {
        return Apple;
    }

    public void setApple(int apple) {
        apple = apple * 7;
        Apple = apple;
    }

    public String toString(){
        System.out.println(getApple());
        return null;
    }
}
