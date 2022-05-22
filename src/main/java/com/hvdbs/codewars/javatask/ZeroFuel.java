package com.hvdbs.codewars.javatask;

public class ZeroFuel {
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        return distanceToPump / mpg <= fuelLeft;
    }
}
