package com.hvdbs.codewars.statgenerator.enums;

public enum Difficulty {
    ONE("1 kyu"),
    TWO("2 kyu"),
    THREE("3 kyu"),
    FOUR("4 kyu"),
    FIVE("5 kyu"),
    SIX("6 kyu"),
    SEVEN("7 kyu"),
    EIGHT("8 kyi");

    private final String description;

    Difficulty(String description) {
        this.description = description;
    }

    String getDescription() {
        return description;
    }
}
