package terminal;

import java.util.List;

public class Command implements CommandParser{

    private int parameterAddDelAnimal;

    private List<Integer> commandParameters;


    public Command(List<Integer> commandParameters) {
        this.parameterAddDelAnimal = commandParameters.get(0) * 5 + commandParameters.get(1);
        this.commandParameters = commandParameters;
    }

    public int getParametrAddDelAnimal() {
        return parameterAddDelAnimal;
    }

    public List<Integer> getCommandParameters() {
        return commandParameters;
    }

    @Override
    public Command parseCommand(List<Integer> parser) {
        return parseCommand( parser);
    }



}
