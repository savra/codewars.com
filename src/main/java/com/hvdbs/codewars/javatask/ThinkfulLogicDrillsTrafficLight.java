package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.util.HashMap;
import java.util.Map;

@CodewarsInfo(
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
