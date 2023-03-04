package terminal;

import Zoo.AnimalZoo;
import animals.Lion;
import animals.Snake;
import animals.Wolf;

public class CommandExecutableFactory {
    public CommandExecutableFactory createExecutable(AnimalZoo animalZoo, Command command) {
        return (CommandExecutableFactory) command.getAnimalExecutable();
    }
    public void chooseCommandExecutable(AnimalZoo animalZoo, Command command) {
        int age = 0, weight = 0, countLimbs = 0;
        int additionalParameter = command.getCommandParameters().get(2);
        int check = command.getCommandParameters().get(0) * 10 + command.getCommandParameters().get(1);
        if (command.getCommandParameters().get(1) == 1) {
            age = command.getCommandParameters().get(3);
            weight = command.getCommandParameters().get(4);
            countLimbs = command.getCommandParameters().get(5);
        }
        switch (check) {
            case 1:
                command.setAnimalExecutable(new CreateLionExecutable(animalZoo, new Lion(age, weight, countLimbs, additionalParameter)));
                break;
            case 2:
                command.setAnimalExecutable(new DeleteLionExecutable(animalZoo, additionalParameter));
                break;
            case 3:
                command.setAnimalExecutable(new CreateWolfExecutable(new Wolf(age,weight,countLimbs, additionalParameter), animalZoo));
                break;
            case 4:
                command.setAnimalExecutable(new DeleteWolfExecutable(animalZoo, additionalParameter));
                break;
            case 5:
                command.setAnimalExecutable(new CreateSnakeExecutable(animalZoo, new Snake(age, weight, countLimbs, additionalParameter)));
                break;
            case 6:
                command.setAnimalExecutable(new DeleteSnakeExecutable(animalZoo, additionalParameter));
                break;

        }
    }


}
