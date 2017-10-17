package ch.larsbaertschi.MasterMind;

import ch.larsbaertschi.MasterMind.game.GameLoop;

public class Main {

    private static GameLoop gameLoop = new GameLoop();
    public static boolean debug = true;

    public static void main(String[] args) {
        System.out.println("Starting MasterMind by Lars Bärtschi");

        gameLoop.run();
    }
}
