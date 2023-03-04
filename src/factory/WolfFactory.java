package factory;

import animals.Lion;
import animals.Wolf;

import java.util.ArrayList;
import animals.Wolf;
public class WolfFactory {

    public static ArrayList<Wolf> createWolf (int wolfCount){
        ArrayList<Wolf> wolfInCage = new ArrayList<>(wolfCount);
        for (int i = 0; i < wolfCount; i++){
            Wolf wolf1  = new Wolf(3, 45, 4,  0.7);
            Wolf wolf2  = new Wolf(7, 38, 4,  0.9);
            Wolf wolf3  = new Wolf(5, 47, 4,  0.6);
            Wolf wolf4  = new Wolf(9, 30, 4,  0.5);
            wolfInCage.add(wolf1);
            wolfInCage.add(wolf2);
            wolfInCage.add(wolf3);
            wolfInCage.add(wolf4);
        }
        return  wolfInCage;

    }

}
