package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.List;

@CodeInfo(
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
