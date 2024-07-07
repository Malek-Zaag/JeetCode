/*
 * @lc app=leetcode id=461 lang=java
 *
 * [461] Hamming Distance
 */

// @lc code=start
class Solution {
    public int hammingDistance(int x, int y) {
        String sx = Integer.toBinaryString(x);
        String sy = Integer.toBinaryString(y);
        System.out.printf("%s %s", sx, sy);
        int max = Math.max(sx.length(), sy.length());
        int output = 0;
        for (int i = 0; i < max; i++) {
            if (sx.charAt(i) == sy.charAt(i)) {
                output++;
            }
        }
        return output;
        // 1 -> 0001
        // 4 -> 0100
    }
}
// @lc code=end
