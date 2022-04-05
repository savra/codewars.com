package javatask;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountSheep {
    public static String countingSheep(int num) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= num; i++) {
            result.append(i).append(" sheep...");
        }

        return result.toString();
    }

    public static String countingSheep2(int num) {
        return Stream.iterate(1, (n) -> n + 1).limit(num).map(n -> n + " sheep...").collect(Collectors.joining());
    }
}
