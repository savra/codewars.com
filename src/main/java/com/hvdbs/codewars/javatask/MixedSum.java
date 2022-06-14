package com.hvdbs.codewars.javatask;

import java.util.List;

public class MixedSum {

    /*
     * Assume input will be only of Integer o String type
     */
    public int sum(List<?> mixed) {
        return mixed.stream().mapToInt(value -> value instanceof String ? Integer.parseInt((String) value) : (int) value).sum();
    }
}
