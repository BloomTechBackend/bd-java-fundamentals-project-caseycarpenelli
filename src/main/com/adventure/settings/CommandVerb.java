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
    EMPTY,
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
    @SuppressWarnings("checkstyle:ReturnCount")
    public static CommandVerb getVerb(String verbString) throws InvalidCommandException, EmptyCommandException {
        if (verbString == null) {
            throw new EmptyCommandException("this command is empty, please try again");
        }
        switch (verbString.toLowerCase(Locale.ROOT)) {
            case "take":
                return CommandVerb.TAKE;
            case "move":
                return CommandVerb.MOVE;
            case "use":
                return CommandVerb.USE;
            case "dig":
                return CommandVerb.DIG;
            case "examine":
                return CommandVerb.EXAMINE;
            case "look":
                return CommandVerb.LOOK;
            case "help":
                return CommandVerb.HELP;
            case "fight":
                return CommandVerb.FIGHT;
            case "inventory":
                return CommandVerb.INVENTORY;
            case " ":
                throw new EmptyCommandException("this command is empty, please try again");
            default:
                throw new InvalidCommandException("this command is invalid, please try again");


        }
    }
}


