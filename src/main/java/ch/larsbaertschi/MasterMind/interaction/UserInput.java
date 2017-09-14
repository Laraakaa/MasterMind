package ch.larsbaertschi.MasterMind.interaction;

import ch.larsbaertschi.MasterMind.game.MastermindColor;

import java.text.ParseException;

public class UserInput {

    public MastermindColor[] colors = new MastermindColor[4];

    public UserInput() {

    }

    public static UserInput parse(String input) throws ParseException {
        UserInput inputObj = new UserInput();

        if (!(input.split(" ").length == 4)) {
            throw new ParseException("Validation Error", 1);
        }

        String[] colors = input.split(" ");
        for (int i = 0; i < colors.length; i++) {
            inputObj.colors[i] = MastermindColor.getByName(colors[i]);

            if (inputObj.colors[i] == null) {
                throw new ParseException("Validation Error: Unknown Color: " + colors[i], 1);
            }
        }

        return inputObj;
    }

}
