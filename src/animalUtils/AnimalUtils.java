package animalUtils;

import animals.Animal;

import java.util.Collections;
import java.util.List;

public class AnimalUtils {
    public static <T extends Animal> void sortAnimalByAge(List<T> animalList){
        Collections.sort(animalList, new AnimalAgeComparator());
    }
}
