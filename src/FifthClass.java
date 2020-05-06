import java.util.Scanner;

public class FifthClass {

    private double input;
    private double total;
    private int i;

    public void apple (){ // METHOD

        try {
            for (i = 0; i < 5; i++) {
                    System.out.println("Enter a value");
                    Scanner scan = new Scanner(System.in);
                    total = scan.nextInt();
                    total =+ input;
            }
                    System.out.println(total / i);
        }
        catch(Exception e){
                    System.out.println(e);
        }

            setTotal(total);
            setInput(input);
    }

    public void setTotal(double NewTotal) {
        total = NewTotal;
    }

    public double getTotal() {
        return total;
    }

    public void setInput(double NewInput) {
        input = NewInput;
        }

    public double getInput() {
        return input;
    }

    public void getting (){
        System.out.println(getTotal());
    }


}
