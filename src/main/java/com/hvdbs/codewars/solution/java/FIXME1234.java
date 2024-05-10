package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.HashMap;
import java.util.Map;

@CodeInfo(
        difficulty = Difficulty.SEVEN,
        name = "FIXME: 1, 2, 3, 4",
        url = "https://www.codewars.com/kata/5b13c699af73864aa7000031"
)
public class FIXME1234 {
    private static final Map<String, MyNumber> cache = new HashMap<>();

    static {
        cache.put("one", MyNumber.ONE);
        cache.put("ichi", MyNumber.ONE);
        cache.put("un", MyNumber.ONE);
        cache.put("two", MyNumber.TWO);
        cache.put("ni", MyNumber.TWO);
        cache.put("deux", MyNumber.TWO);
        cache.put("three", MyNumber.THREE);
        cache.put("san", MyNumber.THREE);
        cache.put("trois", MyNumber.THREE);
        cache.put("four", MyNumber.FOUR);
        cache.put("shi", MyNumber.FOUR);
        cache.put("quatre", MyNumber.FOUR);
    }

    enum MyNumber {
        ONE(1, "one", "ichi", "un"),
        TWO(2, "two", "ni", "deux"),
        THREE(3, "three", "san", "trois"),
        FOUR(4, "four", "shi", "quatre")
        ;

        private final int val;

        MyNumber(int val, String ...names) {
            this.val = val;
            for (final String n : names) cache.put(n, this);
        }

        public int intValue() {
            return this.val;
        }

    }

    static MyNumber getNumber(final String name) {
        return cache.get(name);
    }
}
