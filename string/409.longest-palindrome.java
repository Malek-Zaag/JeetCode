/*
 * @lc app=leetcode id=409 lang=java
 *
 * [409] Longest Palindrome
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();
        if (n == 1)
            return 1;
        int oddCount = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < n; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i : map.values()) {
            if (i % 2 != 0) {
                oddCount++;
            }

        }
        if (oddCount > 1) {
            return n - oddCount + 1;
        }
        return n;
    }
}
// @lc code=end
