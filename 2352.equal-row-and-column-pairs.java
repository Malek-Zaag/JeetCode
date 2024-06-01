/*
 * @lc app=leetcode id=2352 lang=java
 *
 * [2352] Equal Row and Column Pairs
 */

// @lc code=start

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Solution {
    public int equalPairs(int[][] grid) {
        int output = 0;
        HashMap<String, Integer> h = new HashMap<>();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < grid.length; i++) {
            // s.append(Arrays.stream(grid[i]).mapToObj(Integer::toString).collect(Collectors.joining("-")));
            for (int j = 0; j < grid.length; j++) {
                s.append(Integer.toString(grid[i][j]));
                s.append("-");
            }
            h.put(s.toString(), h.getOrDefault(s.toString(), 0) + 1);
            s.setLength(0);
        }
        for (int i = 0; i < grid.length; i++) {
            s.setLength(0);
            for (int j = 0; j < grid.length; j++) {
                s.append(Integer.toString(grid[j][i]));
                s.append("-");
            }
            output += h.getOrDefault(s.toString(), 0);
            s.setLength(0);
            ;
        }
        return output;
    }
}
// @lc code=end
