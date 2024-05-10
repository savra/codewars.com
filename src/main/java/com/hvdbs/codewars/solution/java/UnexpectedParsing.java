package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.HashMap;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Unexpected parsing",
        url = "https://www.codewars.com/kata/54fdaa4a50f167b5c000005f"
)
public class UnexpectedParsing {
    public static HashMap<String, String> getStatus(boolean isBusy) {
        HashMap<String, String> statusMap = new HashMap<>();
        String status;

        if (isBusy) {
            status = "busy";
        } else {
            status = "available";
        }

        statusMap.put("status", status);

        return statusMap;
    }
}
