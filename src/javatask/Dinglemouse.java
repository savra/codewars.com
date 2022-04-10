package javatask;

public class Dinglemouse {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int[] result = new int[]{humanYears, 15, 15};

        if (humanYears >= 2) {
            for (int i = 1; i < result.length; i++) {
                result[i] += 9;
            }

            if (humanYears == 2) {
                return result;
            }

            result[1] += (humanYears - 2) * 4;
            result[2] += (humanYears - 2) * 5;
        }

        return result;
    }
}
