package ch.larsbaertschi.MasterMind.game;

import ch.larsbaertschi.MasterMind.interaction.UserInput;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;

public class GameLoop {

    Scanner scanner = new Scanner(System.in);
    SpielBrett brett = new SpielBrett();

    // Game state
    int round = 0;

    public void run() {
        while(true) {
            System.out.println("Round #" + round);
            System.out.println("Enter a combination");
            step();
            round++;
        }
    }

    public void step() {
        UserInput input = readAndParseCode();
        System.out.println(Arrays.toString(input.colors));
    }

    public UserInput readAndParseCode() {
        try {
            UserInput input = UserInput.parse(scanner.nextLine());
            return input;
        } catch (ParseException e) {
            System.out.println("Dieser Wert ist nicht zulässig. Bitte versuche es erneut!");
            return readAndParseCode();
        }
    }
}
