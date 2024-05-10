package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "String Templates - Bug Fixing #5",
        url = "https://www.codewars.com/kata/55c90cad4b0fe31a7200001f"
)
public class StringTemplatesBugFixing {
    public static String buildString(String... args) {
        StringBuilder sb = new StringBuilder();
        sb.append("I like ");

        for (int i = 0; i < args.length; i++) {
            sb.append(args[i]);

            if (i != args.length - 1) {
                sb.append(", ");
            }
        }

        sb.append("!");

        return sb.toString();
    }
}
