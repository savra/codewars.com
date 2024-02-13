package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.SEVEN,
        name = "Product Of Maximums Of Array (Array Series #2)",
        url = "https://www.codewars.com/kata/5a63948acadebff56f000018"
)
public class ProductOfMaximumsOfArray {
    public static long maxProduct(int[] numbers, int sub_size) {
        java.util.Arrays.sort(numbers);

        long res = 1;

        for (int i = numbers.length - 1, j = sub_size; j > 0; j--, i--) {
            res *= numbers[i];
        }

        return res;
    }
}
