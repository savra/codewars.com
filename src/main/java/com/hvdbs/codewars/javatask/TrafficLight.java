package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.util.HashMap;
import java.util.Map;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Sort and Star",
        kataUrl = "https://www.codewars.com/kata/57cfdf34902f6ba3d300001e")
public class TrafficLight {
    public static String updateLight(String current) {
        Map<String, String> trafficLight = new HashMap<>();

        trafficLight.put("green", "yellow");
        trafficLight.put("yellow", "red");
        trafficLight.put("red", "green");

        return trafficLight.get(current);
    }
}
