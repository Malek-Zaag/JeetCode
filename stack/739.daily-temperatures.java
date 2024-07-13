package stack;
/*
 * @lc app=leetcode id=739 lang=java
 *
 * [739] Daily Temperatures
 */

// @lc code=start
import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // ArrayList<Integer> output = new ArrayList<Integer>();
        // int n = temperatures.length;
        // int i = 0;
        // while (i < n) {
        // int st = temperatures[i];
        // int j = i;
        // while (j < n) {
        // if (temperatures[j] > st) {
        // output.add(j - i);
        // break;
        // } else
        // j++;
        // }
        // if (j == n)
        // output.add(0);
        // i++;
        // }
        // for (int j : output)
        // System.out.println(j);
        // return output.stream().mapToInt(Integer::intValue).toArray();
        int n = temperatures.length;
        int[] ret = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                ret[idx] = i - idx;
            }
            stack.push(i);
        }
        return ret;
    }
}

// @lc code=end
