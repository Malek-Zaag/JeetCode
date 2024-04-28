/*
 * @lc app=leetcode id=238 lang=java
 *
 * [238] Product of Array Except Self
 */

// @lc code=start

class Solution {
    public int calculateSuf(int start, int end, int[] nums) {
        int res = 1;
        for (int i = start; i <= end; i++) {
            res *= nums[i];
        }
        return res;
    }

    public int calculatePre(int start, int end, int[] nums) {
        int res = 1;
        for (int i = start; i >= end; i--) {
            res *= nums[i];
        }
        return res;
    }

    public int[] productExceptSelf(int[] nums) {
        int suf, pre = 1;
        int[] res = new int[nums.length];
        for (int j = 0; j < nums.length; j++) {
            suf = calculateSuf(j + 1, nums.length - 1, nums);
            pre = calculatePre(j - 1, 0, nums);
            res[j] = suf * pre;
        }
        for (int i : res)
            System.out.println(i);
        return res;
    }
}
// @lc code=end
