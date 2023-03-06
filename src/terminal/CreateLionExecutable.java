package terminal;

import Zoo.AnimalZoo;
import animals.Lion;

public class CreateLionExecutable implements CommandExecutable{
    private AnimalZoo animalZoo;
    private Lion lion;

    public CreateLionExecutable(AnimalZoo animalZoo, Command command) {
        this.animalZoo = animalZoo;
        this.lion = new Lion(command.getCommandParameters().get(1), command.getCommandParameters().get(2),
                command.getCommandParameters().get(3), command.getCommandParameters().get(4));
    }

    @Override
    public void execute() {
        this.animalZoo.addLion(this.lion);

    }
}
