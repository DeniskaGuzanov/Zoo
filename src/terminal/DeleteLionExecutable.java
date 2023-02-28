package terminal;

import Zoo.AnimalZoo;

public class DeleteLionExecutable implements CommandExecutable {
    private AnimalZoo animalZoo;


    public DeleteLionExecutable (AnimalZoo animalZoo){
        this.animalZoo = animalZoo;

    }

    @Override
    public void execute() {
        this.animalZoo.getFirstLion();

    }
}
