package ch.larsbaertschi.MasterMind.game;

import java.util.Arrays;
import java.util.Random;

public class Code {

    MastermindColor[] colors = new MastermindColor[6];

    public static Code generateRandom() {
        Random rdm = new Random();

        Code c = new Code();
        for (int i = 0; i < c.colors.length; i++) {
            c.colors[i] = MastermindColor.values()[rdm.nextInt(MastermindColor.values().length)];
        }

        return c;
    }

    @Override
    public String toString() {
        return Arrays.toString(colors);
    }
}
