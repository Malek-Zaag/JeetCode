/*
 * @lc app=leetcode id=1004 lang=java
 *
 * [1004] Max Consecutive Ones III
 */

// @lc code=start
class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0, r = 0;
        int res = 0;
        int maxK = k;
        while (r < nums.length) {
            if (nums[r] == 0) {
                maxK--;
            }
            if (maxK < 0) {
                if (nums[l] == 0) {
                    maxK++;
                }
                l++;
            }
            if (maxK >= 0) {
                res = Math.max(res, r - l + 1);
            }
            r++;
        }
        return res;
    }
}
// @lc code=end
