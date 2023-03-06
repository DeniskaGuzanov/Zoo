package terminal;

import Zoo.AnimalZoo;

public class DeleteSnakeExecutable implements CommandExecutable{

    private AnimalZoo animalZoo;
    private int lengthSnake;


    public DeleteSnakeExecutable(AnimalZoo animalZoo, Command command) {
        this.animalZoo = animalZoo;
        this.lengthSnake = command.getCommandParameters().get(2);
    }

    @Override
    public void execute() {
        this.animalZoo.takeOutSnake(this.lengthSnake);
    }

}
