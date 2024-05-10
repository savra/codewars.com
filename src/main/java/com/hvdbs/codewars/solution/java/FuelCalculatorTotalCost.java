package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Fuel Calculator: Total Cost",
        url = "https://www.codewars.com/kata/57b58827d2a31c57720012e8"
)
public class FuelCalculatorTotalCost {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    public static double fuelPrice(int litres, double pricePerLitre) {
        if (litres >= 10) {
            return litres * (pricePerLitre - 0.25);
        }

        if (litres >= 8) {
            return litres * (pricePerLitre - 0.2);
        }

        if (litres >= 6) {
            return litres * (pricePerLitre - 0.15);
        }

        if (litres >= 4) {
            return litres * (pricePerLitre - 0.1);
        }

        if (litres >= 2) {
            return litres * (pricePerLitre - 0.05);
        }

        return litres * pricePerLitre;
    }
}
