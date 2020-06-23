public class THREADDDD implements Runnable {
    private String name;
    private int time;

    public THREADDDD(String x, int n) {
        this.name = x; // Reference to private variables
        this.time = n; // Reference to private variables
    }
    public void run() { // Runnable method
        try {
            System.out.println("The Thread metadata " + " Name: " + name + " Runtime: " + time);
            Thread.sleep(time); // Send Thread to sleep when constructor input time has ended
        }
        catch(Exception e){
            System.out.println(e);
        }

    }

}
