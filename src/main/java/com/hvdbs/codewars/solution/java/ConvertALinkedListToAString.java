package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SEVEN,
        name = "Convert a linked list to a string",
        url = "https://www.codewars.com/kata/582c297e56373f0426000098"
)
public class ConvertALinkedListToAString {
    class Node {
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public int getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }
    }
    //My Time Complexity: O(n)
    //My Space complexity: O(n)
    public static String stringify(Node list) {
        StringBuilder sb = new StringBuilder();

        if (list == null) {
            return "null";
        }

        for(Node cur = list; cur != null; cur = cur.getNext()) {
            sb.append(cur.getData()).append(" -> ");
        }

        return sb.append("null").toString();
    }
}
