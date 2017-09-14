package ch.larsbaertschi.MasterMind.game;

public class SpielBrett {

    Code codeSecret;

    public SpielBrett() {
        codeSecret = Code.generateRandom();
        System.out.println(codeSecret);
    }

}
