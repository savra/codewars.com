package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Holiday VI - Shark Pontoon",
        url = "https://www.codewars.com/kata/57e921d8b36340f1fd000059"
)
public class HolidayVISharkPontoon {
    public static String shark(int pontoonDistance, int sharkDistance,
                               int youSpeed, int sharkSpeed, boolean dolphin) {
        double myTimeToPontoon = (double)pontoonDistance / youSpeed;

        if (dolphin) {
            sharkSpeed = sharkSpeed / 2;
        }

        double sharkTimeToPontoon = (double)sharkDistance / sharkSpeed;

        return myTimeToPontoon < sharkTimeToPontoon ? "Alive!" : "Shark Bait!";
    }
}
