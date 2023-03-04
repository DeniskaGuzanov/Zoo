package terminal;

import Zoo.AnimalZoo;
import animals.Lion;

public class CreateLionExecutable implements CommandExecutable{
    private AnimalZoo animalZoo;
    private Lion lion;

    public CreateLionExecutable(AnimalZoo animalZoo, Lion lion) {
        this.animalZoo = animalZoo;
        this.lion = lion;
    }

    @Override
    public void execute() {
        this.animalZoo.addLion(this.lion);

    }
}
