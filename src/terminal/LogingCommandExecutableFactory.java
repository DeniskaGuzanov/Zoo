package terminal;

import Zoo.AnimalZoo;

public class LogingCommandExecutableFactory extends CommandExecutableFactoryImpl{


    @Override
    public void createCommandExecutable(AnimalZoo animalZoo, Command command){
        System.out.println("Start");
        super.createCommandExecutable(animalZoo, command);
        System.out.println("End");
    }

}
