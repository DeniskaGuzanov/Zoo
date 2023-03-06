package terminal;

import Zoo.AnimalZoo;

public class DeleteWolfExecutable implements CommandExecutable{
    private AnimalZoo animalZoo;
    private int heightWolf;

    public DeleteWolfExecutable(AnimalZoo animalZoo, Command command) {
        this.animalZoo = animalZoo;
        this.heightWolf = command.getCommandParameters().get(2);
    }

    @Override
    public void execute() {
        this.animalZoo.takeOutWolf(this.heightWolf);
    }
}
