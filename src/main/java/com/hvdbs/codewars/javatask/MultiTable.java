package com.hvdbs.codewars.javatask;

public class MultiTable {
    public static String multiTable(int num) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= 9; i++) {
            stringBuilder.append(i).append(" * ").append(num).append(" = ").append(i * num).append("\n");
        }

        return stringBuilder.append(10).append(" * ").append(num).append(" = ").append(10 * num).toString();
    }

    public static void main(String[] args) {
        multiTable(5);
    }
}
