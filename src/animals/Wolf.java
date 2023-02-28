package animals;

public class Wolf extends Animal implements Comparable<Wolf>{

    private static int MAX_WEIGHT = 70;
    private static final String TYPE = "Wolf";

    private String colorWolf;

    public Wolf(int age, int weight, int countLimbs, String colorWolf) {
        super(age, weight, countLimbs);
        this.colorWolf = colorWolf;
    }

    public String getColorWolf() {
        return colorWolf;
    }

    public void setColorWolf(String colorWolf) {
        this.colorWolf = colorWolf;
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "age=" + age +
                ", weight=" + weight +
                ", countLimbs=" + countLimbs +
                ",colorWolf=" + colorWolf +
                '}';
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
    public int compareTo(Wolf o) {

        if (this.age > o.age) {
            return 1;
        } else if (this.age < o.age) {
            return -1;
        }
        return 0;
    }
}
