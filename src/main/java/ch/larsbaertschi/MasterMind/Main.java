package ch.larsbaertschi.MasterMind;

import ch.larsbaertschi.MasterMind.game.GameLoop;

public class Main {

    static GameLoop gameLoop = new GameLoop();

    public static void main(String[] args) {
        System.out.println("Starting MasterMind by Lars Bärtschi");

        gameLoop.run();
    }
}
