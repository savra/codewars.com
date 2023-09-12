package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Grasshopper - Grade book",
        url = "https://www.codewars.com/kata/55cbd4ba903825f7970000f5"
)
public class GrasshopperGradeBook {
    public static char getGrade(int s1, int s2, int s3) {
        int avg = (s1 + s2 + s3) / 3;

        if (avg >= 90 && avg <= 100) {
            return 'A';
        } else if (avg >= 80 && avg < 90) {
            return 'B';
        } else if (avg >= 70 && avg < 80) {
            return 'C';
        } else if (avg >= 60 && avg < 70) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
