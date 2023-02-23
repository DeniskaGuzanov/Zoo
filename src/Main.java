import animals.Lion;
import animals.Wolf;
import cage.LionCage;
import cage.WolfCage;
import factory.LionsFactory;
import factory.WolfFactory;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Lion> lions = LionsFactory.createLions(8);
        LionCage lionsInCage = new LionCage(lions);
        System.out.println(lionsInCage);

        ArrayList<Wolf> wolves = WolfFactory.createWolf(6);
        WolfCage wolfInCage = new WolfCage(wolves);
        System.out.println(wolfInCage);

    }
}
