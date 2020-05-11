package Vowels;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vowels {
    public static int getCount(String str) {
        int vowelsCount;

        vowelsCount = Pattern.compile("[^aeiou]").matcher(str).replaceAll("").length();

        return vowelsCount;
    }

    public static void main(String[] args) {
        System.out.println(Vowels.getCount("Nopuaeae!"));
    }
}
