package terminal;

import Zoo.AnimalZoo;

public class DeleteSnakeExecutable implements CommandExecutable{

    private AnimalZoo animalZoo;
    private int lengthSnake;


    public DeleteSnakeExecutable(AnimalZoo animalZoo, int lengthSnake) {
        this.animalZoo = animalZoo;
        this.lengthSnake = lengthSnake;
    }

    @Override
    public void execute() {
        this.animalZoo.takeOutSnake(this.lengthSnake);
    }

}
