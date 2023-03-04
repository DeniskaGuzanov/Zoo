package cage;

import animals.Animal;
import animals.Wolf;
import animals.WolfComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class WolfCage implements AnimalCage<Wolf> {
    private int volumeOfGarbage;
    private List<Wolf> wolf;
    private int wolfCount;
    protected static final int MAX_CLEAN_CAGE = 40;

    public WolfCage(List<Wolf> wolf) {
        this.wolf = wolf;
        this.wolfCount = wolf.size();
        volumeOfGarbage = wolfCount * 4;
    }


    public int getVolumeOfGarbage() {
        return volumeOfGarbage;
    }

    public int getWolfCount() {
        return wolfCount;
    }


    public List<Wolf> getWolf() {
        return wolf;
    }

    public void setWolf(List wolf) {
        this.wolf = wolf;
    }

    @Override
    public void addAnimalCage(Wolf wolfe) {

        wolf.add((Wolf) wolfe);
        wolfCount++;
        volumeOfGarbage += 4;
    }

    @Override
    public String toString() {
        return "WolfCage{" +
                "volumeOfGarbage=" + volumeOfGarbage +
                ", wolf=" + wolf +
                '}';
    }

    @Override
    public void addFoodCage(int foodWeight) {

        volumeOfGarbage = volumeOfGarbage + foodWeight;
    }

    @Override
    public void clearCage() {
        if (volumeOfGarbage > MAX_CLEAN_CAGE) {
            volumeOfGarbage = 0;
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

    @Override
    public Wolf getChooseAnAnimal(double animalParametr) {

        Wolf animalWoolf;
        int temp = -1;
        for (int i = 0; i < this.wolf.size(); i++) {
            if (this.wolf.get(i).getHeightWolf() == animalParametr) {
                temp = i;
                break;
            }
        }
        if (temp == -1) {
            System.out.println("Такого  волка нет в клетке");
            return null;
        }  else {
            animalWoolf = wolf.get(temp);
            wolf.remove(temp);
            return animalWoolf;
        }

    }

    public void sortWolf(ArrayList<Wolf> wolf) {
        Collections.sort(wolf);
    }

    public void sortWeight() {
        Collections.sort(wolf, new WolfComparator());
    }
}
