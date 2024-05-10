package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SEVEN,
        name = "Linked Lists - Get Nth Node",
        url = "https://www.codewars.com/kata/55befc42bfe4d13ab1000007"
)
public class LinkedListsGetNthNode {
    class Node{
        public int data;
        public Node next = null;

        public static int getNth(Node n, int index) throws Exception {
            if (index < 0) {
                throw new Exception();
            }

            Node cur = n;

            while (index > 0) {
                cur = cur.next;
                index--;
            }

            return cur.data;
        }
    }
}
