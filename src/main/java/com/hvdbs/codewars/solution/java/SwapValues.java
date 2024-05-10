package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Swap Values",
        url = "https://www.codewars.com/kata/5388f0e00b24c5635e000fc6"
)
public class SwapValues {
    public Object[] arguments;

    public void Swapper(final Object[] args) {
        arguments = args;
    }

    public void swapValues() {
        Object[] args = arguments;
        Object temp = args[0];
        args[0] = args[1];
        args[1] = temp;
    }
}
