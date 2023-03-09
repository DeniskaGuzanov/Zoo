package terminal;

import Zoo.AnimalZoo;
import animals.Snake;

public class CreateSnakeExecutable implements CommandExecutable{
    private AnimalZoo animalZoo;
    private Snake snake;

    public CreateSnakeExecutable(AnimalZoo animalZoo, Command command) {
        this.animalZoo = animalZoo;
        this.snake = new Snake(command);
    }

    @Override
    public void execute() {
        this.animalZoo.addSnake(this.snake);
    }


}
