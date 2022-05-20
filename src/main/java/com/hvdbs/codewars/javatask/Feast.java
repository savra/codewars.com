package com.hvdbs.codewars.javatask;

public class Feast {
    public static boolean feast(String beast, String dish) {
        return beast.charAt(0) == dish.charAt(0) && beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1);
    }

    public static void main(String[] args) {
        System.out.println(feast("kj","kj"));
        System.out.println(feast("chickadee","chocolate cake"));
        System.out.println(feast("brown bear","bear claw"));
    }
}
