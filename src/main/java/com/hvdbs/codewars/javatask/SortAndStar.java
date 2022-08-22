package com.hvdbs.codewars.javatask;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

public class SortAndStar {
    public static String twoSort(String[] s) {
        Optional<String> first = Arrays.stream(s).sorted().findFirst();
        if (first.isPresent()) {
            char[] chars = first.get().toCharArray();

            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < chars.length; i++)
                stringBuilder.append(chars[i]).append("***");

            return stringBuilder.subSequence(0, stringBuilder.length() - 3).toString();
        }

        return null;
    }

    public static void main(String[] args) {
        SortAndStar.twoSort(new String[]{"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"});
    }
}
