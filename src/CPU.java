import java.util.Random;

public class CPU implements Runnable { // Implemented Interfaces

    private int num;
    private String Name;
    Random r = new Random();


    CPU(int NewNum, String NewName) { // Constructor
        this.Name = NewName;
        this.num = NewNum;
    }

    @Override
    public void run() {
        int Ran = 1+r.nextInt(100);
        try {
            for (int i = 1; i < num+1; i++) {
                System.out.println(Name + "\t" + i);
                Thread.sleep(Ran);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }



}
