package com.hvdbs.codewars.javatask;

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

    public static void main(String[] args) {
        System.out.println(greet("english"));
    }
}
