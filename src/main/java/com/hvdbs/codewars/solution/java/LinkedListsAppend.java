package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SEVEN,
        name = "Linked Lists - Append",
        url = "https://www.codewars.com/kata/55d17ddd6d7868493e000074",
        spaceComplexity = "O(1)",
        timeComplexity = "O(N)")
public class LinkedListsAppend {
    class Node {

        int data;
        Node next = null;

        Node(final int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public static Node append(Node listA, Node listB) {
            if (listA == null && listB == null) {
                return null;
            }

            if (listA == null) {
                return listB;
            }

            if (listB == null) {
                return listA;
            }

            Node cur = listA;

            while (cur.next != null) { cur = cur.next; }

            cur.next = listB;

            return listA;
        }
    }
}
