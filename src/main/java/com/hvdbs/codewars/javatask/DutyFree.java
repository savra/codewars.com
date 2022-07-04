package com.hvdbs.codewars.javatask;

public class DutyFree {
    public static int dutyFree(int normPrice, int discount, int hol) {
        return (int) (hol / (normPrice * (discount / 100.0)));
    }
}
