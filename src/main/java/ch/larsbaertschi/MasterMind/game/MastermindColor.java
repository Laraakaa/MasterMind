package ch.larsbaertschi.MasterMind.game;

import java.util.HashMap;
import java.util.Map;

public enum MastermindColor {
    GREEN("Grün"),
    BLUE("Blau"),
    RED("Rot"),
    YELLOW("Gelb"),
    ORANGE("Orange"),
    GREY("Grau");


    private String name;

    private static Map<String, MastermindColor> map = new HashMap<String, MastermindColor>();

    static {
        for (MastermindColor color : MastermindColor.values()) {
            map.put(color.name, color);
        }
    }


    MastermindColor(String name) {
        this.name = name;
    }

    public static MastermindColor getByName(String name) {
        return map.get(name);
    }
}
