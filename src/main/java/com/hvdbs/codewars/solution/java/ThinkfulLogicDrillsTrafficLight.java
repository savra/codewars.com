package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.HashMap;
import java.util.Map;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Thinkful - Logic Drills: Traffic light\n",
        url = "https://www.codewars.com/kata/58649884a1659ed6cb000072")
public class ThinkfulLogicDrillsTrafficLight {
    public static String updateLight(String current) {
        Map<String, String> trafficLight = new HashMap<>();

        trafficLight.put("green", "yellow");
        trafficLight.put("yellow", "red");
        trafficLight.put("red", "green");

        return trafficLight.get(current);
    }
}
