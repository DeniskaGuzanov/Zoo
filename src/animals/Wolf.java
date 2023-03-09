package animals;

import terminal.Command;

public class Wolf extends Animal implements Comparable<Wolf>{

    private static int MAX_WEIGHT = 70;
    private static final String TYPE = "Wolf";

    protected double heightWolf;

    public Wolf(int age, int weight, int countLimbs, double heightWolf) {
        super(age, weight, countLimbs);
        this.heightWolf = heightWolf;
    }

    public Wolf(Command command) {
        super(command.getCommandParameters().get(1), command.getCommandParameters().get(2),
                command.getCommandParameters().get(3));
        this.heightWolf = command.getCommandParameters().get(3);
    }

    public double getHeightWolf() {
        return heightWolf;
    }

    public void setHeightWolf(double heightWolf) {
        this.heightWolf = heightWolf;
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "age=" + age +
                ", weight=" + weight +
                ", countLimbs=" + countLimbs +
                ",heightWolf=" + heightWolf +
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
