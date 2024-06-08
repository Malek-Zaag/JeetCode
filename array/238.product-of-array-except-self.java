/*
 * @lc app=leetcode id=238 lang=java
 *
 * [238] Product of Array Except Self
 */

// @lc code=start

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int pre[] = new int[n];
        int suf[] = new int[n];
        suf[n - 1] = 1;
        pre[0] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            suf[i] = suf[i + 1] * nums[i + 1];
        }
        for (int i = 1; i < nums.length; i++) {
            pre[i] = pre[i - 1] * nums[i - 1];
        }
        for (int j = 0; j < nums.length; j++) {
            res[j] = suf[j] * pre[j];
        }
        return res;
    }
}
// @lc code=end
