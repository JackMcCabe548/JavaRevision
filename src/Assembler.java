import java.util.Arrays;

public class Assembler {

    private Super [] ArrayData = new Super[2]; // POLYMORPHIC ARRAY
    private int i = 0;

    public void Together(Super x){
        if (i < ArrayData.length) {
            ArrayData[i] = x;
            System.out.println("Object added number " + i);
            i++;
        }
    }

    public String printer(){
        for (Super x: ArrayData){ // Cycles through array values
            x.Data();
        }
        return null;
    }

}
