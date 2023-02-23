package cage;

import animals.Animal;

import java.util.ArrayList;

public class WolfCage implements AnimalCage{
    private int cleanCage;
    private ArrayList wolf;

    public WolfCage(ArrayList wolf) {
        this.wolf = wolf;
    }

    @Override
    public int addAnimalCage(Animal animal) {
        return 0;
    }

    @Override
    public String toString() {
        return "WolfCage{" +
                "cleanCage=" + cleanCage +
                ", wolf=" + wolf +
                '}';
    }

    @Override
    public int addFoodCage(int foodWeight) {
        return 0;
    }

    @Override
    public int clearCage() {
        return 0;
    }

    @Override
    public Animal getFirstAnimal() {
        return null;
    }
}
