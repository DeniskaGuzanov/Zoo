package animals;

import java.util.Random;

public class Lion extends Animal implements Comparable<Lion>{

    private int maneVolume;

    private static int MAX_WEIGHT = 100;
    protected static final String TYPE = "Lion";

    public Lion(int age, int weight, int countLimbs, int maneVolume) {
        super(age, weight, countLimbs);
        this.maneVolume = maneVolume;
    }

    public int getManeVolume() {
        return maneVolume;
    }

    public void setManeVolume(int maneVolume) {
        this.maneVolume = maneVolume;
    }

    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public int getMaxWeight() {
        return MAX_WEIGHT;
    }

    @Override
    public String toString() {
        return "Lion{" +
                "age=" + age +
                ", weight=" + weight +
                ", countLimbs=" + countLimbs +
                ", maneVolume=" + maneVolume +
                '}';
    }

    @Override
    public void feed(int foodWeight) {

        if(weight + foodWeight > MAX_WEIGHT){
            weight = MAX_WEIGHT;
            System.out.println("Максимальный вес превышен");
        }else {
            weight = weight + foodWeight;
        }
    }

    @Override
    public int compareTo(Lion o) {
        if(this.age > o.age){
            return 1;
        } else if (this.age < o.age) {
            return -1;
        }
        return 0;
    }


}
