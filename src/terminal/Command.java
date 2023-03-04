package terminal;

import java.util.List;

public class Command implements CommandParser{
    private CommandExecutable animalExecutable;

    private List<Integer> commandParameters;



    public Command(CommandExecutable animalExecutable, List<Integer> commandParameters) {
        this.animalExecutable = animalExecutable;
        this.commandParameters = commandParameters;
    }

    public CommandExecutable getAnimalExecutable() {
        return animalExecutable;
    }


    public void setAnimalExecutable(CommandExecutable animalExecutable) {
        this.animalExecutable = animalExecutable;
    }

    public List<Integer> getCommandParameters() {
        return commandParameters;
    }

    public void setCommandParameters(List<Integer> commandParameters) {
        this.commandParameters = commandParameters;
    }

    public static Integer parseToInt(String input) {
        Integer result = null;
        int check = -1;
        do {

            try {
                Integer.parseInt(input);
                result = Integer.parseInt(input);
                check = 1;
            } catch (Exception e) {
                System.out.println("ошибка ввода");
            }
        } while (check != 1);
        return result;
    }



    @Override
    public Command parseCommand(List<Integer> parser) {
        return parseCommand( parser);
    }


}
