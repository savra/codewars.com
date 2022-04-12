package javatask;

import java.util.stream.IntStream;

public class MultipleOfIndex {
    public static int[] multipleOfIndex(int[] array) {
        return IntStream.range(1, array.length)
                .filter(index -> array[index] % index == 0)
                .map(index -> array[index])
                .toArray();
    }
}
