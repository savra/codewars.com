package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.List;

@CodewarsInfo(
        difficulty = Difficulty.SEVEN,
        name = "List Filtering",
        url = "https://www.codewars.com/kata/53dbd5315a3c69eed20002dd"
)
public class ListFiltering {
    public static List<Object> filterList(final List<Object> list) {
        List<Object> res = new ArrayList<>();

        for (Object o : list) {
            if (!(o instanceof String)) {
                res.add(o);
            }
        }

        return res;
    }
}
