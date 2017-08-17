package ch.larsbaertschi.MasterMind.interaction;

import java.text.ParseException;

public class UserInput {

    public UserInput() {

    }

    public static UserInput parse(String input) throws ParseException {
        if (!(input.length() == 5)) {
            throw new ParseException("Validation Error", 1);
        }
        return new UserInput();
    }

}
