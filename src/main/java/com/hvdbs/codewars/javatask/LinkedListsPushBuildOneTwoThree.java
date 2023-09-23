package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.SEVEN,
        name = "Linked Lists - Push & BuildOneTwoThree",
        url = "https://www.codewars.com/kata/55be95786abade3c71000079"
)
public class LinkedListsPushBuildOneTwoThree {
    static class Node {

        int data;
        Node next = null;

        Node(final int data) {
            this.data = data;
        }

        public static Node push(final Node head, final int data) {
            if (head == null) {
                return new Node(data);
            }

            Node n = new Node(data);
            n.next = head;

            return n;
        }

        public static Node buildOneTwoThree() {
            return push(push(push(null, 3), 2), 1);
        }
    }
}
