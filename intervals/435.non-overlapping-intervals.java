package intervals;
/*
 * @lc app=leetcode id=435 lang=java
 *
 * [435] Non-overlapping Intervals
 */

// @lc code=start

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, new MyComparator());

        int count = 1;
        int n = intervals.length;
        int prev_value = intervals[0][1];
        for (int i = 1; i < n; i++) {
            if (intervals[i][0] >= prev_value) {
                prev_value = intervals[i][1];
                count++;
            }
        }
        return n - count;
    }

    class MyComparator implements Comparator<int[]> {
        public int compare(int[] a, int[] b) {
            return a[1] - b[1];
        }
    }
}
// @lc code=end
