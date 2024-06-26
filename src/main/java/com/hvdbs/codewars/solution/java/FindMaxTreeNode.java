package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SEVEN,
        name = "Find Max Tree Node",
        url = "https://www.codewars.com/kata/5a04450c8ba914083700000a"
)
public class FindMaxTreeNode {
    class TreeNode {
        TreeNode  left;
        TreeNode  right;
        int value;
    }

    static int findMax(TreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        int res = root.value;
        int res1 = findMax(root.left);
        int res2 = findMax(root.right);

        if (res1 > res) {
            res = res1;
        }

        if(res2 > res) {
            res = res2;
        }

        return res;
    }
}
