package terminal;
import Zoo.AnimalZoo;


public class CommandExecutableFactoryImpl implements CommandExecutableFactory{

    private CommandExecutable commandExecutable;

    @Override
    public void createCommandExecutable(AnimalZoo animalZoo, Command command) {
        switch (command.getParametrAddDelAnimal()){
            case 1:
                this.commandExecutable = new CreateLionExecutable(animalZoo, command);
                break;
            case 2:
                this.commandExecutable = new CreateSnakeExecutable(animalZoo, command);
                break;
            case 3:
                this.commandExecutable = new CreateWolfExecutable(animalZoo, command);
                break;
            case 4:
                this.commandExecutable = new DeleteLionExecutable(animalZoo, command);
                break;
            case 5:
                this.commandExecutable = new DeleteSnakeExecutable(animalZoo,command);
                break;
            case 6:
                this.commandExecutable = new DeleteWolfExecutable(animalZoo, command);


        }

    }

    @Override
    public CommandExecutable getCommandExecutable() {
        return commandExecutable;
    }

}
