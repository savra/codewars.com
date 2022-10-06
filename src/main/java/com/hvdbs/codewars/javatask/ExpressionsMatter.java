package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Sort and Star",
        kataUrl = "https://www.codewars.com/kata/57cfdf34902f6ba3d300001e")
public class ExpressionsMatter {
    public static int expressionsMatter(int a, int b, int c)
    {
        return 0;
    }

    public static void main(String[] args) {
        //Примем 0 за (, 1 за ) и сформируем всевозможные комбинации
        //Примем 0 за + и 1 за * и сформируем всевозможные комбинации, т.к. операции две, то будем pow(2, n) вариантов
        int n = 3;
        String[] result = new String[n];
        String[] operations = new String[] {"+", "*", "(", ")"};

    }

    private static void rec(int n) {

    }
}
