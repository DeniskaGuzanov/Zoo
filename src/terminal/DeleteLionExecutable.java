package terminal;

import Zoo.AnimalZoo;

public class DeleteLionExecutable implements CommandExecutable {
    private AnimalZoo animalZoo;
    protected int maneLion;



    public DeleteLionExecutable (AnimalZoo animalZoo, Command command){
        this.animalZoo = animalZoo;
        this.maneLion = command.getCommandParameters().get(2);
    }

    @Override
    public void execute() {
        this.animalZoo.takeOutLion(this.maneLion);

    }
}
