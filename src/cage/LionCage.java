package cage;

import animals.Animal;
import animals.Lion;
import animals.LionComparator;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LionCage implements AnimalCage<Lion> {

    private int volumeOfGarbage;
    private List<Lion> lion;
    private int lionCount;
    protected  static final int MAX_CLEAN_CAGE = 40;


    public LionCage(List<Lion> lion){
        this.lion = lion;
        this.lionCount = lionCount;
        volumeOfGarbage = this.lionCount * 5;
    }

    public int getLionCount() {
        return lionCount;
    }

    public int getVolumeOfGarbage() {
        return volumeOfGarbage;
    }

    public List<Lion> getLion() {
        this.lion = lion;
        return lion;
    }

    @Override
    public void addAnimalCage(Lion lions) {
        lion.add((Lion) lions);
        lionCount++;
        volumeOfGarbage += 5;

    }

    @Override
    public String toString() {
        return "LionCage{" +
                "volumeOfGarbage=" + volumeOfGarbage +
                ", lion=" + lion +
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

    @Override
    public Lion getChooseAnAnimal(double animalParametr) {
        Lion animalLion;
        int temp = -1;
        for (int i = 0; i < this.lion.size(); i++) {
            if (this.lion.get(i).getManeVolume() == animalParametr) {
                temp = i;
                break;
            }
        }
        if (temp == -1) {
            System.out.println("Льва с такой гривой нет в клетке");
            return null;
        }  else {
            animalLion = lion.get(temp);
            lion.remove(temp);
            return animalLion;
        }


    }

    public  void  sortLions(){
        Collections.sort(lion);
    }
    public void sortByVolume(){
        Collections.sort(lion, new LionComparator());
    }

}
