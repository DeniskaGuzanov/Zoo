package factory;

import animals.Lion;

import java.util.ArrayList;

public class LionsFactory {

    static public ArrayList<Lion> createLions (int lionCount){
        ArrayList<Lion> lionInCage = new ArrayList<>(lionCount);
        for (int i = 0; i < lionCount; i++){
            Lion lion  = new Lion(10, 80, 4, 300);
            lionInCage.add(lion);
        }
        return  lionInCage;

    }
}
