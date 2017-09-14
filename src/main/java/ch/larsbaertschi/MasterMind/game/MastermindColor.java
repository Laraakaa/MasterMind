package ch.larsbaertschi.MasterMind.game;

public enum MastermindColor {
    GREEN("Grün"),
    BLUE("Blau"),
    RED("Rot"),
    YELLOW("Gelb"),
    ORANGE("Orange"),
    GREY("Grau");


    private String name;

    MastermindColor(String name) {
        this.name = name;
    }
}
