package com.hvdbs.codewars.javatask;

public class StaticElectrickery {
    private static int ONE_HUNDRED = 100;

    public static final StaticElectrickery INST = new StaticElectrickery();

    private final int value;

    private StaticElectrickery() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }

    public static void main(String[] args) {
        System.out.println(StaticElectrickery.INST.plus100(23));
    }
}
