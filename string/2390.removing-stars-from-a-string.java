/*
 * @lc app=leetcode id=2390 lang=java
 *
 * [2390] Removing Stars From a String
 */

// @lc code=start

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.stream.Collectors;

import javax.sound.sampled.Line;

class Solution {
    public String removeStars(String s) {
        Stack<Character> q = new Stack<Character>();
        StringBuilder l = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '*') {
                q.pop();
            } else
                q.push(c);
        }
        for (char c : q)
            l.append(c);
        return l.toString();
    }
}
// @lc code=end
