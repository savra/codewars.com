package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SEVEN,
        name = "Supernatural",
        url = "https://www.codewars.com/kata/55c9a8cda33889d69e00008b"
)
public class Supernatural {
    public static String bob(String beast) {
        String phrase = switch (beast) {
            case "werewolf", "shapeshifter" -> "Silver knife or bullet to the heart";
            case "vampire" -> "Behead it with a machete";
            case "wendigo" -> "Burn it to death";
            case "angel" -> "Use the angelic blade";
            case "demon" -> "Use Ruby's knife, or some Jesus-juice";
            case "ghost" -> "Salt and iron, and don't forget to burn the corpse";
            case "dragon" -> "You have to find the excalibur for that";
            case "djinn" -> "Stab it with silver knife dipped in a lamb's blood";
            case "pagan god" -> "It depends on which one it is";
            case "leviathan" -> "Use some Borax, then kill Dick";
            case "ghoul" -> "Behead it";
            case "jefferson starship" -> "Behead it with a silver blade";
            case "reaper" -> "If it's nasty, you should gank who controls it";
            case "rugaru" -> "Burn it alive";
            case "skinwalker" -> "A silver bullet will do it";
            case "phoenix" -> "Use the colt";
            case "witch" -> "They are humans";
            default -> "";
        };

        return phrase.isEmpty() ? "I have friggin no idea yet, idjits!" : phrase + ", idjits!";
    }
}
