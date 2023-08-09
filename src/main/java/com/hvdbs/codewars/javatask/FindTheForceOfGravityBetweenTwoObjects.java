package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(name = "Find the force of gravity between two objects",
        difficulty = Difficulty.EIGHT,
        url = "https://www.codewars.com/kata/5b609ebc8f47bd595e000627")
public class FindTheForceOfGravityBetweenTwoObjects {
    public static double solution(double[] arrVal, String[] arrUnit) {
        double[] result = new double[3];

        for (int i = 0; i < arrVal.length; i++) {
            if (i <= 1) {
                switch (arrUnit[i]) {
                    case "g":
                        result[i] = arrVal[i] / 1e3;
                        break;

                    case "mg":
                        result[i] = arrVal[i] / 1e6;
                        break;

                    case "μg":
                        result[i] = arrVal[i] / 1e9;
                        break;

                    case "lb":
                        result[i] = arrVal[i] * 0.453592;
                        break;

                    default:
                        result[i] = arrVal[i];
                }
            } else {
                switch (arrUnit[i]) {
                    case "cm":
                        result[i] = arrVal[i] / 1e2;
                        break;

                    case "mm":
                        result[i] = arrVal[i] / 1e3;
                        break;

                    case "μm":
                        result[i] = arrVal[i] / 1e6;
                        break;
                    case "ft":
                        result[i] = arrVal[i] * 0.3048;
                        break;

                    default:
                        result[i] = arrVal[i];
                }
            }
        }

        return 6.67 * 1e-11 * (result[0] * result[1]) / Math.pow(result[2], 2);
    }
}
