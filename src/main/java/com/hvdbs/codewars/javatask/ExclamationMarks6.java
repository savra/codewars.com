package com.hvdbs.codewars.javatask;

import java.util.regex.Pattern;

public class ExclamationMarks6 {

    public static String remove(String s, int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 0, j = n; i < s.length(); i++) {
            if (s.charAt(i) != '!' || j <= 0) {
                result.append(s.charAt(i));
            } else {
                j--;
            }
        }

        return result.toString();
    }
}
