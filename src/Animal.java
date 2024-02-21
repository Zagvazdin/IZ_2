import java.util.*;

public class Animal {
    String name;
    String type;
    List<String> commands = new ArrayList<>();

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void listCommands() {
        if (commands.isEmpty()) {
            System.out.println("У животного нет изученных команд.");
        } else {
            System.out.println("Команды для животного " + name + ":");
            for (String command : commands) {
                System.out.println(command);
            }
        }
    }

    public void teachCommand(String command) {
        commands.add(command);
        System.out.println("Команда \"" + command + "\" добавлена для животного " + name);
    }
}
