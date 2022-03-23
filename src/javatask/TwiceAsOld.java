package javatask;

public class TwiceAsOld {
    public static int TwiceAsOld(int dadYears, int sonYears) {
        int twiceSonYears = sonYears << 1;

        if (dadYears > twiceSonYears) {
            return dadYears - twiceSonYears;
        } else {
            return twiceSonYears - dadYears;
        }
    }
}
