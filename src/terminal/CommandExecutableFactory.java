package terminal;

import Zoo.AnimalZoo;


public interface CommandExecutableFactory {

    public void createCommandExecutable(AnimalZoo animalZoo, Command command);

    public CommandExecutable getCommandExecutable();

}
