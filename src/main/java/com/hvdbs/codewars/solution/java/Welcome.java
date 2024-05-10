package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Welcome!",
        url = "https://www.codewars.com/kata/577ff15ad648a14b780000e7")
public class Welcome {
    public static String greet(String language) {
        String result;

        switch (language) {
            case "czech":
                result = "Vitejte";
                break;
            case "danish":
                result = "Velkomst";
                break;
            case "dutch":
                result = "Welkom";
                break;
            case "estonian":
                result = "Tere tulemast";
                break;
            case "finnish":
                result = "Tervetuloa";
                break;
            case "flemish":
                result = "Welgekomen";
                break;
            case "french":
                result = "Bienvenue";
                break;
            case "german":
                result = "Willkommen";
                break;
            case "irish":
                result = "Failte";
                break;
            case "italian":
                result = "Benvenuto";
                break;
            case "latvian":
                result = "Gaidits";
                break;
            case "lithuanian":
                result = "Laukiamas";
                break;
            case "polish":
                result = "Witamy";
                break;
            case "spanish":
                result = "Bienvenido";
                break;
            case "swedish":
                result = "Valkommen";
                break;
            case "welsh":
                result = "Croeso";
                break;
            default:
                result = "Welcome";
        }

        return result;
    }
}
