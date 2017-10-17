package ch.larsbaertschi.MasterMind.game;

import ch.larsbaertschi.MasterMind.interaction.UserInput;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;

public class GameLoop {

    private Scanner scanner = new Scanner(System.in);
    private SpielBrett brett = new SpielBrett();

    // Game state
    private int round = 0;

    public void run() {
        while(true) {
            System.out.println("Round #" + round);
            System.out.println("Enter a combination");
            if (step()) {
                System.out.println("Danke fürs spielen");
                break;
            }
            round++;
        }
    }

    private boolean step() {
        UserInput input = readAndParseCode();
        System.out.println(Arrays.toString(input.colors));

        int isCorrectPositon = 0;
        int isCorrect = 0;

        MastermindColor[] secret = brett.codeSecret.colors.clone();

        // Gleiche Positionen entfernen.
        for (int i = 0; i < 4; i++) {
            if (input.colors[i] == secret[i]) {
                isCorrectPositon++;
                input.colors[i] = null;
                secret[i] = null;
            }
        }

        // Unterschiedliche Positionen prüfen
        for (MastermindColor color : input.colors) {
            if (color != null) {
                if (Arrays.asList(secret).contains(color)) {
                    isCorrect++;
                }
            }
        }

        System.out.println("Korrekt positioniert sind: " + isCorrectPositon + " und an der falschen Stelle, aber farblich richtig sind " + isCorrect);

        if (isCorrectPositon == 4) {
            System.out.println("Herzliche Gratulation, du hast gewonnen!");
            return true;
        }
        return false;
    }

    private UserInput readAndParseCode() {
        try {
            return UserInput.parse(scanner.nextLine());
        } catch (ParseException e) {
            System.out.println("Dieser Wert ist nicht zulässig. Bitte versuche es erneut! (Format-Beispiel: Grün Blau Blau Rot)");
            return readAndParseCode();
        }
    }
}
