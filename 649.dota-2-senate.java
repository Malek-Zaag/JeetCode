/*
 * @lc app=leetcode id=649 lang=java
 *
 * [649] Dota2 Senate
 */

// @lc code=start

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public String predictPartyVictory(String senate) {
        int n = senate.length();
        Queue<Integer> radiant = new LinkedList<Integer>();
        Queue<Integer> dire = new LinkedList<Integer>();
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R')
                radiant.add(i);
            else
                dire.add(i);
        }
        while (!radiant.isEmpty() && !dire.isEmpty()) {
            int r = radiant.poll();
            int d = dire.poll();
            if (r < d)
                radiant.add(r + n);
            else
                dire.add(d + n);
        }
        return (radiant.size() > dire.size()) ? "Radiant" : "Dire";
    }
}
// @lc code=end
