package com.hvdbs.codewars.javatask;

import java.util.regex.Pattern;

public class ReplaceAllVowel {
    public static String replace(final String s) {
        return Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE).matcher(s).replaceAll("!");
    }
}
