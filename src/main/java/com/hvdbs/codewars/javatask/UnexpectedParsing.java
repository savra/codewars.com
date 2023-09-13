package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.util.HashMap;

@CodewarsInfo(
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
