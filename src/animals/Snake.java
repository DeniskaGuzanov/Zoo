package animals;

public class Snake extends Animal {
    private int bodyLength;
    private static int MAX_WEIGHT = 30;
    protected static final String TYPE = "Snake";

    public Snake(int age, int weight, int countLimbs) {
        super(age, weight, countLimbs);
    }

    public int getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(int bodyLength) {
        this.bodyLength = bodyLength;
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
        return "Snake{" +
                "age=" + age +
                ", weight=" + weight +
                ", bodyLength=" + bodyLength +
                '}';
    }
}
