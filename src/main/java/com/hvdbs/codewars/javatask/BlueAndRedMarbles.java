package com.hvdbs.codewars.javatask;

public class BlueAndRedMarbles {
    public static double guessBlue(int blueStart, int redStart, int bluePulled, int redPulled) {
        return (double)(blueStart - bluePulled) / ((redStart - redPulled) + (blueStart - bluePulled));
    }
}
