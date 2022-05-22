package com.hvdbs.codewars.javatask;

import java.util.HashMap;
import java.util.Map;

public class TrafficLight {
    public static String updateLight(String current) {
        Map<String, String> trafficLight = new HashMap<>();

        trafficLight.put("green", "yellow");
        trafficLight.put("yellow", "red");
        trafficLight.put("red", "green");

        return trafficLight.get(current);
    }
}
