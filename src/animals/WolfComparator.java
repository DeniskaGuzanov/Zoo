package animals;

import java.util.Comparator;

public class WolfComparator implements Comparator<Wolf> {

    @Override
    public int compare(Wolf wolf1, Wolf wolf2) {
        if(wolf1.getWeight() > wolf2.getWeight() && wolf1.getAge() > wolf2.getAge()){
            return 1;
        } else if (wolf1.getHeightWolf() < wolf2.getHeightWolf() && wolf1.getAge() < wolf2.getAge()) {
            return -1;
        }
        return 0;

    }
}
