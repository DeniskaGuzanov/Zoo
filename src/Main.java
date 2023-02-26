import animals.Lion;
import animals.Wolf;
import cage.LionCage;
import cage.WolfCage;
import factory.LionsFactory;
import factory.WolfFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Lion> lions = LionsFactory.createLions(1);
        LionCage lionCage = new LionCage(lions);
        System.out.println(lionCage);
        lionCage.addFoodCage(50);
        lionCage.sortByVolume();
        Collections.sort(lions);
        System.out.println(lionCage);

        ArrayList<Wolf> wolves = WolfFactory.createWolf(1);
        WolfCage wolfCage = new WolfCage(wolves);
        System.out.println(wolves);
        wolfCage.addFoodCage(50);
        Collections.sort(wolves);


        System.out.println(wolfCage);


    }
}
