package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Classic Hello World",
        url = "https://www.codewars.com/kata/57036f007fd72e3b77000023"
)
public class ClassicHelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
