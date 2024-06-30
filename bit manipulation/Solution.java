/*
 * @lc app=leetcode id=190 lang=java
 *
 * [190] Reverse Bits
 */

// @lc code=start
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        if (n == 0)
            return 0;
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res <<= 1;
            int lsb = n & 1;
            res += lsb;
            n = n >> 1;
        }
        return res;
    }
}
// @lc code=end
