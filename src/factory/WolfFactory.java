package factory;

import animals.Lion;
import animals.Wolf;

import java.util.ArrayList;
import animals.Wolf;
public class WolfFactory {

    static public ArrayList<Wolf> createWolf (int wolfCount){
        ArrayList<Wolf> wolfInCage = new ArrayList<>(wolfCount);
        for (int i = 0; i < wolfCount; i++){
            Wolf wolf  = new Wolf(3, 60, 4, "gray");
            wolfInCage.add(wolf);
        }
        return  wolfInCage;

    }

}
