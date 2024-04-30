/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start

class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int snowball = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                snowball++;
            } else if (snowball > 0) {
                int temp = nums[i];
                nums[i] = 0;
                nums[i - snowball] = temp;
            }
        }
    }
}
// @lc code=end
