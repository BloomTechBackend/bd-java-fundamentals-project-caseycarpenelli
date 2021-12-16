package main.com.adventure.settings;

import java.util.Locale;

/**
 * Sprint 3 Module 1
 * This CommandVerb will be used instead of strings once we've learned about Enums.
 */

public enum CommandVerb {
    TAKE,
    MOVE,
    USE,
    DIG,
    EXAMINE,
    LOOK,
    HELP,
    //Used in Sprint 3 Module 2
    FIGHT,
    //Used in Sprint 3 Module 3
    INVENTORY;


    /**
     * Takes verbString to determine and return the associated CommandVerb.
     * @param verbString - the verb from the user input
     * @return - the CommandVerb associated with the given input.
     */
    public static CommandVerb getVerb(String verbString) throws InvalidCommandException, EmptyCommandException {
        CommandVerb commandVerb;
        if (verbString == null) {
            throw new EmptyCommandException("this command is empty, please try again");
        }
        switch (verbString.toLowerCase(Locale.ROOT)) {
            case "take":
                commandVerb = CommandVerb.TAKE;
                break;
            case "move":
                commandVerb = CommandVerb.MOVE;
                break;
            case "use":
                commandVerb = CommandVerb.USE;
                break;
            case "dig":
                commandVerb = CommandVerb.DIG;
                break;
            case "examine":
                commandVerb = CommandVerb.EXAMINE;
                break;
            case "look":
                commandVerb = CommandVerb.LOOK;
                break;
            case "help":
                commandVerb = CommandVerb.HELP;
                break;
            case "fight":
                commandVerb = CommandVerb.FIGHT;
                break;
            case "inventory":
                commandVerb = CommandVerb.INVENTORY;
                break;
            case " ":
                throw new EmptyCommandException("this command is empty, please try again");
            default:
                throw new InvalidCommandException("this command is invalid, please try again");


        }
        return commandVerb;
    }
}


