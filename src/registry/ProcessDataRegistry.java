package registry;

import command.Command;

import java.util.HashMap;
import java.util.Map;

public class ProcessDataRegistry {

    final Map<Integer, Command> _commands = new HashMap<>();

    public void register(Integer type, Command command) {
        _commands.put(type, command);
    }

    public Command resolve(Integer type) {
        return _commands.get(type);
    }

}