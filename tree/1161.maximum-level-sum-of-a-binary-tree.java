/*
 * @lc app=leetcode id=1161 lang=java
 *
 * [1161] Maximum Level Sum of a Binary Tree
 */

// @lc code=start

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public int maxLevelSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        int sum = Integer.MIN_VALUE, idx = 1, curr_idx = 1;
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            int curr = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                curr += node.val;
                if (node != null) {
                    if (node.left != null) {
                        q.add(node.left);
                    }
                    if (node.right != null) {
                        q.add(node.right);
                    }

                }
            }
            if (curr > sum) {
                sum = curr;
                idx = curr_idx;
            }
            curr_idx++;
        }
        return idx;
    }
}
// @lc code=end
