package terminal;

import Zoo.AnimalZoo;
import animals.Wolf;

public class CreateWolfExecutable implements CommandExecutable{
    private Wolf wolf;
    private AnimalZoo animalZoo;

    public CreateWolfExecutable(Wolf wolf, AnimalZoo animalZoo) {
        this.wolf = wolf;
        this.animalZoo = animalZoo;
    }

    @Override
    public void execute() {
        this.animalZoo.addWolf(this.wolf);
    }

}
