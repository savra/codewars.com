package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.util.Arrays;
import java.util.function.IntPredicate;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Enumerable Magic #1 - True for All?",
        url = "https://www.codewars.com/kata/54598d1fcbae2ae05200112c"
)
public class EnumerableMagic1TrueForAll {
    public static boolean all(int[] list, IntPredicate predicate){
        return Arrays.stream(list).allMatch(predicate);
    }
}
