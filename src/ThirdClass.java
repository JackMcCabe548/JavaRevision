
public class ThirdClass extends FirstClass { //Class

    private int Y [];

    ThirdClass(int NEWY[]){
        Y = NEWY;
        setY(NEWY);
        //System.out.println(this);
    }

    //public int[] getY() {
    //    return Y;
    //}

    public void setY(int[] NEWY) {
        Y = NEWY;
        for (int i = 0 ; i < NEWY.length; i++){
            NEWY[i] = NEWY[i]+ 10;
        }
        for (int J = 0; J < Y.length; J++){
            System.out.println(Y[J]);
        }
    }

    //public String toString(){
    //    System.out.println(getY());
     //   return null;
    //}
}
