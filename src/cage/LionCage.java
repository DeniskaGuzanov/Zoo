package cage;

import animals.Animal;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LionCage implements AnimalCage {

    private int cleanCage;
    private ArrayList lion;

    public LionCage(ArrayList lion) {
        this.lion = lion;
    }

    public int getCleanCage() {
        return cleanCage;
    }

    public void setCleanCage(int cleanCage) {
        this.cleanCage = cleanCage;
    }

    @Override
    public int addAnimalCage(Animal animal) {
        lion.add(lion);
        return lion.size();
    }

    @Override
    public String toString() {
        return "LionCage{" +
                "cleanCage=" + cleanCage +
                ", lion=" + lion +
                '}';
    }

    @Override
    public int addFoodCage(int foodWeight) {
        return 0;
    }

    @Override
    public int clearCage() {
        cleanCage = 0;
        return cleanCage;
    }

    @Override
    public Animal getFirstAnimal() {
        return null;
    }

}
