package javatask;

import java.util.Arrays;

public class InvertValues {
    public static int[] invert(int[] array) {
        return Arrays.stream(array).map(value -> value * -1).toArray();
    }
}
