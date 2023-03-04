package terminal;

import Zoo.AnimalZoo;
import animals.Snake;

public class CreateSnakeExecutable implements CommandExecutable{
    private AnimalZoo animalZoo;
    private Snake snake;

    public CreateSnakeExecutable(AnimalZoo animalZoo, Snake snake) {
        this.animalZoo = animalZoo;
        this.snake = snake;
    }

    @Override
    public void execute() {
        this.animalZoo.addSnake(this.snake);
    }


}
