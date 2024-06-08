/*
 * @lc app=leetcode id=875 lang=java
 *
 * [875] Koko Eating Bananas
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // int n = piles.length;
        // Arrays.sort(piles);
        // for (int k = 1; k < piles[n - 1]; k++) {
        // int sum = 0;
        // for (int pile : piles) {
        // sum += (pile - 1) / k + 1;
        // }
        // if (sum <= h) {
        // System.out.println(k);
        // return k;
        // }
        // }
        // return 0;
        // }

        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (canEatInTime(piles, mid, h))
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }

    public boolean canEatInTime(int[] piles, int k, int h) {
        int sum = 0;
        for (int pile : piles) {
            sum += (pile - 1) / k + 1;
        }
        if (sum > h)
            return false;
        return true;
    }
}
// @lc code=end
