/*
 * @lc app=leetcode id=452 lang=java
 *
 * [452] Minimum Number of Arrows to Burst Balloons
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int findMinArrowShots(int[][] points) {
        int n = points.length;
        // for (int j = 0; j < n - 1; j++)
        // for (int i = 0; i < (n - 1 - j); i++) {
        // if (points[i][1] >= points[i + 1][1]) {
        // int[] temp = points[i];
        // points[i] = points[i + 1];
        // points[i + 1] = temp;
        // }
        // }
        Arrays.sort(points, (a, b) -> a[1] - b[1]);
        // for (int[] i : points) {
        // System.out.print(i[0]);
        // System.out.println(",");
        // System.out.print(i[1]);
        // System.out.println("\n");
        // }
        int e = points[0][1];
        int result = 1;
        for (int i = 1; i < n; i++) {
            if (e >= points[i][0] && e <= points[i][1]) {
                continue;
            }
            e = points[i][1];
            result++;
        }
        return result;
    }
}
// @lc code=end
