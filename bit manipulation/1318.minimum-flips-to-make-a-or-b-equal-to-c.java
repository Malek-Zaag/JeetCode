/*
 * @lc app=leetcode id=1318 lang=java
 *
 * [1318] Minimum Flips to Make a OR b Equal to c
 */

// @lc code=start
class Solution {
    public int minFlips(int a, int b, int c) {
        int res = 0;
        String as = Long.toBinaryString(Integer.toUnsignedLong(a) | 0x100000000L).substring(1);
        ;
        String bs = Long.toBinaryString(Integer.toUnsignedLong(b) | 0x100000000L).substring(1);
        String cs = Long.toBinaryString(Integer.toUnsignedLong(c) | 0x100000000L).substring(1);
        for (int i = 0; i < 32; i++) {
            if (((as.charAt(i) - '0') | (bs.charAt(i) - '0')) != (cs.charAt(i) - '0')
                    && (as.charAt(i) == bs.charAt(i)) && (as.charAt(i) == '1')) {
                res += 2;
            } else if (((as.charAt(i) - '0') | (bs.charAt(i) - '0')) != (cs.charAt(i) - '0')) {
                res++;
            }
        }
        return res;

    }
}
// @lc code=end
