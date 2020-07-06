public class CPU implements Runnable, CollectedData {

    CollectedData ref; // Reference object

    CPU(CollectedData f) { // Constructor
        f = this.ref;
    }

    @Override
    public void run() {
        ref.P
    }

    @Override
    public void Data() {
        System.out.println("Allen");
    }
}
