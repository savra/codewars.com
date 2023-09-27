package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.FIVE,
        name = "Can you get the loop ?",
        url = "https://www.codewars.com/kata/52a89c2ea8ddc5547a000863"
)
public class CanYouGetTheLoop {
    class Node {
        Node next;
        Node getNext() {
            return next;
        }
    }
    //My Time Complexity: O(n)
    //My Space complexity: O(1)
    public int loopSize(Node node) {
        Node slow = node;
        Node fast = node;

        int i = 1;

        while(fast != null && fast.getNext() != null) {
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
