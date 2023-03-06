package terminal;

import Zoo.AnimalZoo;

import java.util.Scanner;

public class TerminalReader {

    public static TerminalReader terminalReader;
    private CommandParser commandParser;
    private AnimalZoo animalZoo;


    private TerminalReader(CommandParser commandParser){
        this.commandParser = commandParser;
    }

    public static TerminalReader newTerminalReader(CommandParser commandParser, AnimalZoo animalZoo){
        if (terminalReader == null){
            terminalReader = new TerminalReader(commandParser);
        }
        terminalReader.animalZoo = animalZoo;
        return terminalReader;

    }

    public void endless() {
        while(true) {

            Command terminalCommand = this.commandParser.parseCommand();
            CommandExecutableFactory commandExecutableFactory = new CommandExecutableFactoryImpl();
            commandExecutableFactory.createCommandExecutable(this.animalZoo, terminalCommand);
            commandExecutableFactory.getCommandExecutable().execute();
            System.out.println(this.animalZoo);
        }
    }


}
