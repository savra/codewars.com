package javatask;

public class CountOddNumbersBelowN {
    public static int oddCount(int n) {
        return n >> 1;
    }

    public static void main(String[] args) {
        System.out.println(oddCount(1502305757));
    }
}
