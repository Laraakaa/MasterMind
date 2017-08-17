package ch.larsbaertschi.MasterMind;

import java.util.Scanner;

public class GameLoop {

    Scanner scanner = new Scanner(System.in);

    public void run() {
        while(true) {
            step();
        }
    }

    public void step() {

    }

    public String readCode() {
        String input = scanner.nextLine();
    }

}
