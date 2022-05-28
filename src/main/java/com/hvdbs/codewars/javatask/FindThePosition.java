package com.hvdbs.codewars.javatask;

public class FindThePosition {
    private static final int chrCodeSymbolA = 97;

    public static String position(char alphabet) {
        return "Position of alphabet: " + ((int)alphabet - chrCodeSymbolA + 1);
    }
}
