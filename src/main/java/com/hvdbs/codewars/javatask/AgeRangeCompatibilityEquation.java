package com.hvdbs.codewars.javatask;

public class AgeRangeCompatibilityEquation {
    public static String datingRange(int age) {
        return age <= 14 ? (int)Math.floor(age - 0.1 * age) + "-" + (int)Math.floor(age + 0.1 * age) : age / 2 + 7 + "-" + (age - 7) * 2;
    }

    public static void main(String[] args) {
        System.out.println(AgeRangeCompatibilityEquation.datingRange(31));
    }
}
