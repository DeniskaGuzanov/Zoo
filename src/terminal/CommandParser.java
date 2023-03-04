package terminal;

import java.util.List;

public interface CommandParser {
    Command parseCommand(List<Integer> parser);

}
