package terminal;

import Zoo.AnimalZoo;
import animals.Wolf;

public class CreateWolfExecutable implements CommandExecutable{
    private Wolf wolf;
    private AnimalZoo animalZoo;

    public CreateWolfExecutable(AnimalZoo animalZoo, Command command) {
        this.animalZoo = animalZoo;
        this.wolf = new Wolf(command);
    }

    @Override
    public void execute() {
        this.animalZoo.addWolf(this.wolf);
    }

}
