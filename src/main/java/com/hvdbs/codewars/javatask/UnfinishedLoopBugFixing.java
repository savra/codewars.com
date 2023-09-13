package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.List;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Unfinished Loop - Bug Fixing #1",
        url = "https://www.codewars.com/kata/55c28f7304e3eaebef0000da"
)
public class UnfinishedLoopBugFixing {
    public static List CreateList(int number) {
        List list = new ArrayList();

        for (int count = 1; count <= number; count++) {
            list.add(count);
        }

        return list;
    }
}
