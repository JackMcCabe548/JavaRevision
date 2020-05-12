import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class SeventhClass {

    private enum FOURPLANETS {
        MERCURY, VENUS, EARTH, MARS
    }

    private String Asteroid;

    public String SolarSystem(){

        System.out.println("Enter a planet");
        Scanner Comet = new Scanner(System.in);
        String Sun = Comet.nextLine();

        FOURPLANETS FP = FOURPLANETS.valueOf(Sun);

        switch(FP) {
            case MERCURY:
                setAsteroid(FP.toString());
            case VENUS:
                setAsteroid(FP.toString());
            case EARTH:
                setAsteroid(FP.toString());
            case MARS:
                setAsteroid(FP.toString());
        }
        System.out.println(this);

        return null;
    }

    public void setAsteroid(String NewAsteroid) {
        Asteroid = NewAsteroid;
    }
    public String getAsteroid() {
        System.out.println("Planet enetered is " + Asteroid);
        return Asteroid;
    }
    public String toString() {
        System.out.println(getAsteroid());
    return null;
    }
}
