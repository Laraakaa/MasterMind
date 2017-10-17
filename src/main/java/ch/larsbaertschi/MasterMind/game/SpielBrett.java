package ch.larsbaertschi.MasterMind.game;

import ch.larsbaertschi.MasterMind.Main;

class SpielBrett {

    Code codeSecret;

    SpielBrett() {
        codeSecret = Code.generateRandom();
        if (Main.debug) {
            System.out.println(codeSecret);
        }
    }

}
