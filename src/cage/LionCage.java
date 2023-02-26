package cage;

import animals.Animal;
import animals.Lion;
import animals.LionComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LionCage implements AnimalCage<Lion> {

    private int cleanCage;
    private ArrayList lion;
    private int lionCount;
    protected  static final int MAX_CLEAN_CAGE = 40;

    public LionCage(ArrayList<Lion> lion) {
        this.cleanCage = cleanCage;
        this.lion = lion;
        lionCount = lion.size();
    }

    public int getLionCount() {
        return lionCount;
    }

    public int getCleanCage() {
        return cleanCage;
    }

    public ArrayList getLion() {
        this.lion = lion;
        return lion;
    }

    @Override
    public void addAnimalCage(Lion lions) {
        lion.add((Lion) lions);
        lionCount++;
    }

    @Override
    public String toString() {
        return "LionCage{" +
                "cleanCage=" + cleanCage +
                ", lion=" + lion +
                ", lionCount=" + lionCount +
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
        }   else {
            System.out.println("Клетка не грязная");
        }
    }

    @Override
    public Lion getFirstAnimal() {
        if (this.lion == null) {
            System.out.println("Пустая клетка");
            return null;

        } else {
            Random random = new Random();
            int lionRandom = (int) (Math.random() * (this.lion.size()));
            Lion lion1 = (Lion) this.lion.get(lionRandom);
            this.lion.remove(lionRandom);
            System.out.println("Достали льва из клетки" + lionRandom);
            return lion1;
        }
    }
    public  void  sortLions(ArrayList<Lion> lions){
        Collections.sort(lions);
    }
    public void sortByVolume(){
        Collections.sort(lion, new LionComparator());
    }

}
