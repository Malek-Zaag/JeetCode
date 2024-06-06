/*
 * @lc app=leetcode id=846 lang=java
 *
 * [846] Hand of Straights
 */

// @lc code=start
class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize == 0)
            return true;
        if (hand.length % groupSize != 0)
            return false;
        return true;
    }
}
// @lc code=end
