package com.hvdbs.codewars.javatask;

public class WillThereBeEnoughSpace {
    public static int enough(int cap, int on, int wait){
        int result = cap - on - wait;

        return result >= 0 ? 0 : Math.abs(result);
    }
}
