package terminal;

import Zoo.AnimalZoo;

public class DeleteLionExecutable implements CommandExecutable {
    private AnimalZoo animalZoo;
    protected int maneLion;



    public DeleteLionExecutable (AnimalZoo animalZoo, int maneLion){
        this.animalZoo = animalZoo;
        this.maneLion = maneLion;
    }

    @Override
    public void execute() {
        this.animalZoo.takeOutLion(this.maneLion);

    }
}
