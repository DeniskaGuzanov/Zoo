package factory;

import animals.Lion;

import java.util.ArrayList;

public class LionsFactory {

    public static ArrayList<Lion> createLions (int lionCount){
        ArrayList<Lion> lionInCage = new ArrayList<>(lionCount);
        for (int i = 0; i < lionCount; i++){
            Lion lion1  = new Lion(10, 80, 4, 300);
            Lion lion2  = new Lion(3, 86, 4, 500);
            Lion lion3  = new Lion(2, 95, 4, 400);
            Lion lion4 = new Lion(7, 88, 4, 450);
            Lion lion5 = new Lion(5, 90, 4, 600);
            lionInCage.add(lion1);
            lionInCage.add(lion2);
            lionInCage.add(lion3);
            lionInCage.add(lion4);
            lionInCage.add(lion5);

        }
        return  lionInCage;

    }
}
