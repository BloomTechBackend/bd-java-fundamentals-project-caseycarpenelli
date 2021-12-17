package main.com.adventure;

import main.com.adventure.settings.Command;
import main.com.adventure.settings.CommandConstants;
import main.com.adventure.settings.CommandVerb;
import main.com.adventure.settings.EmptyCommandException;
import main.com.adventure.settings.InvalidCommandException;

import java.util.Locale;
import java.util.Scanner;

public class GameInputProcessor {

    /**
     * Asks the user for their next command.
     *
     * @return the response from the user.
     */
    public String prompt() {
        System.out.println("Enter your next command:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    /**
     * Inputs that come into this method represent single action with no object. When building the command, you'll want
     * to supply the first word as the verb and leave the objectName blank.
     * Example input:
     * "help"
     * "look"
     * <p>
     * Note: this command must stay private when running the tests
     *
     * @param input - the input from the user
     * @return - the Command object with the proper verb and blank object
     */
    private Command buildSimpleCommand(String input) {
        String sCom = input;
        int space = input.indexOf(" ");
        if (input.contains(" ")) {
            sCom = input.toLowerCase(Locale.ROOT).substring(0, space);
        }
        try {
            return new Command(CommandVerb.getVerb(sCom));
        } catch (EmptyCommandException | InvalidCommandException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    /**
     * Inputs that come into this method will have an object or objects that the action is acting on. You'll need to
     * include the object parameter as part of the Command object.
     * Example input:
     * "use key"
     * "examine door"
     * "move west"
     * <p>
     * You should also account for incomplete actions (i.e. the object is missing). In that case, you should return an
     * empty string for the object parameter.
     * Example bad input:
     * "move"
     * " use "
     * <p>
     * Note: this command must stay private when running the tests
     *
     * @param input - the input from the user
     * @return - the Command object with the proper verb and object
     */
    private Command buildCommandWithObject(String input) {
        Command command1 = new Command(null);
        int space = input.indexOf(" ");
        String input2 = input.toLowerCase();
        try {
            if (input.equals("")) {
                return null;
            } else if (input.contains(" ")) {
                command1 = new Command(CommandVerb.getVerb(input2.substring(0, space)), input2.substring(space + 1));
            } else if (!input.contains(" ")) {
                command1 = new Command(CommandVerb.getVerb(input2.substring(0, input2.length())), "");
            } else {
                command1 = new Command(CommandVerb.getVerb(input2), input2);

            }
        } catch (EmptyCommandException | InvalidCommandException e) {
            System.out.println(e.getMessage());
        }

        return command1;

    }


    /** DO NOT CHANGE ANYTHING BELOW THIS LINE. **/
    /**
     * Gets the next command from the user.
     *
     * @return a command object
     */
    public Command getNextCommand() {
        String input = prompt();
        return processCommand(input);
    }

    private Command processCommand(String input) {
        String normalizedInput = input.toLowerCase(Locale.ROOT);
        if (normalizedInput.contains(CommandConstants.MOVE) ||
                normalizedInput.contains(CommandConstants.USE) ||
                normalizedInput.contains(CommandConstants.TAKE) ||
                normalizedInput.contains(CommandConstants.EXAMINE)
        ) {
            return buildCommandWithObject(normalizedInput);
        } else {
            return buildSimpleCommand(normalizedInput);
        }
    }

}
