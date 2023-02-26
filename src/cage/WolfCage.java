package cage;

import animals.Animal;
import animals.Wolf;
import animals.WolfComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class WolfCage implements AnimalCage<Wolf> {
    private int cleanCage;
    private ArrayList wolf;
    private int wolfCount;
    protected static final int MAX_CLEAN_CAGE = 40;

    public WolfCage(ArrayList<Wolf> wolf) {
        this.wolf = wolf;
        this.wolfCount = wolf.size();
        cleanCage = wolfCount;
    }

    public int getCleanCage() {
        return cleanCage;
    }

    public int getWolfCount() {
        return wolfCount;
    }


    public ArrayList getWolf() {
        return wolf;
    }

    public void setWolf(ArrayList wolf) {
        this.wolf = wolf;
    }

    @Override
    public void addAnimalCage(Wolf wolfe) {

        wolf.add((Wolf) wolfe);
        wolfCount++;
        cleanCage += 2;
    }

    @Override
    public String toString() {
        return "WolfCage{" +
                "cleanCage=" + cleanCage +
                ", wolf=" + wolf +
                ", wolfCount=" + wolfCount +
                '}';
    }

    @Override
    public void addFoodCage(int foodWeight) {

        cleanCage = cleanCage + foodWeight;
    }

    @Override
    public void clearCage() {
        if (cleanCage > MAX_CLEAN_CAGE) {
            cleanCage = 0;
            System.out.println("Клетка очищена");
        } else {
            System.out.println("Клетка не грязная");
        }
    }

    @Override
    public Wolf getFirstAnimal() {
        if (this.wolf == null) {
            System.out.println("Пустая клетка");
            return null;

        } else {
            Random random = new Random();
            int wolfRandom = (int) (Math.random() * (this.wolf.size()));
            Wolf wolf1 = (Wolf) this.wolf.get(wolfRandom);
            this.wolf.remove(wolfRandom);
            System.out.println("Достали волка из клетки" + wolfRandom);
            return wolf1;
        }

    }

    public void sortWolf(ArrayList<Wolf> wolf) {
        Collections.sort(wolf);
    }

    public void sortWeight() {
        Collections.sort(wolf, new WolfComparator());
    }
}
