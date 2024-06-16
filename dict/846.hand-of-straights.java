/*
 * @lc app=leetcode id=846 lang=java
 *
 * [846] Hand of Straights
 */

// @lc code=start

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0)
            return false;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : hand) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        Arrays.sort(hand);
        int n = hand.length;
        for (int i = 0; i < n; i++) {
            if (map.get(hand[i]) == 0)
                continue;
            for (int j = 0; j < groupSize; j++) {
                int curr = hand[i] + j;
                if (map.getOrDefault(curr, 0) == 0)
                    return false;
                map.put(curr, map.get(curr) - 1);
            }
        }
        return true;
    }
}
// @lc code=end
