/*
 * @lc app=leetcode id=2300 lang=java
 *
 * [2300] Successful Pairs of Spells and Potions
 */

// @lc code=start

import java.util.Arrays;

class Solution {

    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        Arrays.sort(potions);
        int[] res = new int[n];
        for (int i = 0; i < spells.length; i++) {
            int l = 0;
            int r = m - 1;

            while (l <= r) {
                int mid = l + (r - l) / 2;
                long product = (long) spells[i] * potions[mid];
                if (product >= success) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            res[i] = m - l;
        }
        return res;
    }
}
// @lc code=end
