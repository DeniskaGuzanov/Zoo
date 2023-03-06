package terminal;

import Zoo.AnimalZoo;
import animals.Wolf;

public class CreateWolfExecutable implements CommandExecutable{
    private Wolf wolf;
    private AnimalZoo animalZoo;

    public CreateWolfExecutable(AnimalZoo animalZoo, Command command) {
        this.animalZoo = animalZoo;
        this.wolf = new Wolf(command.getCommandParameters().get(1), command.getCommandParameters().get(2),
                command.getCommandParameters().get(3),
                command.getCommandParameters().get(4));
    }

    @Override
    public void execute() {
        this.animalZoo.addWolf(this.wolf);
    }

}
