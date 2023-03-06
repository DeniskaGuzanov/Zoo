package terminal;

import Zoo.AnimalZoo;
import animals.Snake;

public class CreateSnakeExecutable implements CommandExecutable{
    private AnimalZoo animalZoo;
    private Snake snake;

    public CreateSnakeExecutable(AnimalZoo animalZoo, Command command) {
        this.animalZoo = animalZoo;
        this.snake = new Snake(command.getCommandParameters().get(1), command.getCommandParameters().get(2),
                command.getCommandParameters().get(3),command.getCommandParameters().get(4));
    }

    @Override
    public void execute() {
        this.animalZoo.addSnake(this.snake);
    }


}
