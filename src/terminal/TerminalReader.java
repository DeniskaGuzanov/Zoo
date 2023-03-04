package terminal;

import Zoo.AnimalZoo;

import java.util.Scanner;

public class TerminalReader {

    public static TerminalReader terminalReader;
    private CommandParser commandParser;
    private AnimalZoo animalZoo;
    private CommandExecutableFactory commandExecutableFactory;
    private Command command;


    private TerminalReader(CommandParser commandParser){
        this.commandParser = commandParser;
    }

    public static TerminalReader newTerminalReader(CommandParser commandParser, AnimalZoo animalZoo){
        if (terminalReader == null){
            terminalReader = new TerminalReader(commandParser);
        }
        terminalReader.animalZoo = animalZoo;
        terminalReader.commandExecutableFactory = new CommandExecutableFactory();
        return terminalReader;

    }

    public void endless() {
        while(true) {

            this.commandExecutableFactory.chooseCommandExecutable(this.animalZoo, this.command);
            CommandExecutable commandExecutable = (CommandExecutable) commandExecutableFactory.createExecutable(this.animalZoo,this.command);
            commandExecutable.execute();
            System.out.println(this.animalZoo);
        }
    }

}
