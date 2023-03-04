package terminal;

import Zoo.AnimalZoo;

public class DeleteWolfExecutable implements CommandExecutable{
    private AnimalZoo animalZoo;
    private int heightWolf;

    public DeleteWolfExecutable(AnimalZoo animalZoo, int heightWolf) {
        this.animalZoo = animalZoo;
        this.heightWolf = heightWolf;
    }

    @Override
    public void execute() {
        this.animalZoo.takeOutWolf(this.heightWolf);
    }
}
