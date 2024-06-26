package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.FIVE,
        name = "Can you get the loop ?",
        url = "https://www.codewars.com/kata/52a89c2ea8ddc5547a000863",
        spaceComplexity = "O(1)",
        timeComplexity = "O(N)")
public class CanYouGetTheLoop {
    class Node {
        Node next;

        Node getNext() {
            return next;
        }
    }

    public int loopSize(Node node) {
        Node slow = node;
        Node fast = node;

        int i = 1;

        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();

            if (slow == fast) {
                fast = fast.getNext();

                while (slow != fast) {
                    fast = fast.getNext();
                    i++;
                }

                return i;
            }
        }

        return i;
    }
}
