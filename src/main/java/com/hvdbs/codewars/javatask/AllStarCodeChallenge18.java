package com.hvdbs.codewars.javatask;

import java.util.regex.Pattern;

public class AllStarCodeChallenge18 {
    public static int strCount(String str, char letter) {
        return str.length() - str.replaceAll(String.valueOf(letter), "").length();
    }
}
