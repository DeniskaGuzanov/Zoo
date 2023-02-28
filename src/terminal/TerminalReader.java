package terminal;

import java.util.Scanner;

public class TerminalReader {

    public static TerminalReader terminalReader;
    private CommandParser commandParser;

    private TerminalReader(CommandParser commandParser){
        this.commandParser = commandParser;
    }

    public static TerminalReader newTerminalReader(CommandParser commandParser){
        if (terminalReader == null){
            terminalReader = new TerminalReader(commandParser);
        }
        return terminalReader;

    }

    void endless(){
        Scanner iScanner = new Scanner(System.in);
        while (true){
                String input = iScanner.nextLine();
                if (input.equals("enough")) break;


        }
        iScanner.close();
    }

}
