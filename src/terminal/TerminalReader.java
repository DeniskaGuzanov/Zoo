package terminal;

import Zoo.AnimalZoo;

import java.util.Scanner;

import static terminal.AnimallParameter.menuAnimal;

public class TerminalReader {

    public static TerminalReader terminalReader;
    private CommandParser commandParser;
    private AnimalZoo animalZoo;


    public TerminalReader(AnimalZoo animalZoo, CommandParser commandParser) {
        this.animalZoo = animalZoo;
        this.commandParser = commandParser;
    }

    public static TerminalReader newTerminalReader(CommandParser commandParser, AnimalZoo animalZoo){
        if (terminalReader == null){
            terminalReader = new TerminalReader(animalZoo, commandParser);
        }

        return terminalReader;

    }

    public void endless() {
        while(true) {

            Command terminalCommand = this.commandParser.parseCommand(menuAnimal());
            CommandExecutableFactory commandExecutableFactory = new CommandExecutableFactoryImpl();
            commandExecutableFactory.createCommandExecutable(this.animalZoo, terminalCommand);
            commandExecutableFactory.getCommandExecutable().execute();
            System.out.println(this.animalZoo);
        }
    }


}
