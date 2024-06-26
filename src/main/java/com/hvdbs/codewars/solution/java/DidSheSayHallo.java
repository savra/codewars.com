package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.List;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Did she say hallo?",
        url = "https://www.codewars.com/kata/56a4addbfd4a55694100001f",
        timeComplexity = "O(M * N)",
        spaceComplexity = "O(1)")
public class DidSheSayHallo {
    public static boolean validateHello(String greetings) {
        List<String> greetingsList = List.of("hello", "ciao", "salut", "hallo", "hola", "ahoj", "czesc");

        String lowerGreetings = greetings.toLowerCase();

        for (String s : greetingsList) {
            if (lowerGreetings.contains(s)) {
                return true;
            }
        }

        return false;
    }
}
