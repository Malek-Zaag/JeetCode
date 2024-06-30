package stack;
/*
 * @lc app=leetcode id=735 lang=java
 *
 * [735] Asteroid Collision
 */

// @lc code=start

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.stream.Collector;
import java.util.stream.IntStream;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            while (j > 0 && asteroids[i] < 0 && asteroids[j - 1] > 0
                    && Math.abs(asteroids[i]) > asteroids[j - 1]) {
                j--;
            }
            if (j == 0 || asteroids[i] > 0 || asteroids[j - 1] < 0) {
                asteroids[j] = asteroids[i];
                j++;
            } else if (Math.abs(asteroids[i]) == Math.abs(asteroids[j - 1]))
                j--;
        }
        return IntStream.range(0, j).map(k -> asteroids[k]).toArray();
    }
}
// @lc code=end
