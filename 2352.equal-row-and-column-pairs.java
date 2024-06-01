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

// class Solution {
// public int equalPairs(int[][] grid) {
// int output = 0;
// HashMap<String, Integer> h = new HashMap<>();
// StringBuilder s = new StringBuilder();
// for (int i = 0; i < grid.length; i++) {
// //
// //
// s.append(Arrays.stream(grid[i]).mapToObj(Integer::toString).collect(Collectors.joining("-")));
// for (int j = 0; j < grid.length; j++) {
// s.append(Integer.toString(grid[i][j]));
// s.append("-");
// }
// h.put(s.toString(), h.getOrDefault(s.toString(), 0) + 1);
// s.setLength(0);
// }
// for (int i = 0; i < grid.length; i++) {
// s.setLength(0);
// for (int j = 0; j < grid.length; j++) {
// s.append(Integer.toString(grid[j][i]));
// s.append("-");
// }
// output += h.getOrDefault(s.toString(), 0);
// s.setLength(0);
// ;
// }
// return output;
// }
// }
class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        for (int[] row : grid) {
            String rowStr = Arrays.toString(row);
            hashMap.put(rowStr, hashMap.getOrDefault(rowStr, 0) + 1);
        }

        int count = 0;
        for (int j = 0; j < n; j++) {
            int[] col = new int[n];
            for (int i = 0; i < n; i++) {
                col[i] = grid[i][j];
            }
            count += hashMap.getOrDefault(Arrays.toString(col), 0);
        }
        return count;
    }
}
// class Solution {
// public int equalPairs(int[][] grid) {
// int n = grid.length;
// int m = grid[0].length;
// int[][] transpose = new int[m][n];
// for (int i = 0; i < n; i++) {
// for (int j = 0; j < m; j++) {
// // Transpose of matrix
// transpose[j][i] = grid[i][j];
// }
// }
// int ans = 0;
// for (int[] row : grid) {
// for (int[] col : transpose) {
// // Check for equality
// if (Arrays.equals(row, col))
// ans++;
// }
// }
// return ans;
// }
// }
// @lc code=end
