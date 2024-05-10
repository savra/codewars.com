package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;
import java.util.function.IntPredicate;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Enumerable Magic #1 - True for All?",
        url = "https://www.codewars.com/kata/54598d1fcbae2ae05200112c"
)
public class EnumerableMagic1TrueForAll {
    public static boolean all(int[] list, IntPredicate predicate){
        return Arrays.stream(list).allMatch(predicate);
    }
}
