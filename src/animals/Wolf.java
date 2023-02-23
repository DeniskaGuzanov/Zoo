package animals;

public class Wolf extends Animal {

    private static int MAX_WEIGHT = 70;
    private static final String TYPE = "Wolf";

    private String colorWolf;

    @Override
    public String toString() {
        return "Wolf{" +
                "age=" + age +
                ", weight=" + weight +
                ", countLimbs=" + countLimbs +
                ",colorWolf=" + colorWolf +
                '}';
    }

    public Wolf(int age, int weight, int countLimbs, String colorWolf) {
        super(age, weight, countLimbs);
        this.colorWolf = colorWolf;
    }

    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public int getMaxWeight() {
        return MAX_WEIGHT;
    }
}
