/*
 * @lc app=leetcode id=735 lang=java
 *
 * [735] Asteroid Collision
 */

// @lc code=start

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> st = new ArrayDeque<>();
        st.add(asteroids[0]);
        for (int i = 1; i < asteroids.length; i++) {
            if (asteroids[i] > st.peek() && asteroids[i] > 0 && st.peek() < 0) {
                continue;
            } else if (asteroids[i] == -st.peek()) {
                st.pop();
            } else if (asteroids[i] > 0 && st.peek() > 0) {
                st.add(asteroids[i]);
            }
        }
        int[] res = new int[st.size()];
        System.arraycopy(st, 0, res, 0, st.size());
        return res;
    }
}
// @lc code=end
