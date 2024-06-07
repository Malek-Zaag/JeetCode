/*
 * @lc app=leetcode id=1002 lang=java
 *
 * [1002] Find Common Characters
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<String> commonChars(String[] words) {
        List<String> res = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            int minCount = Integer.MAX_VALUE;
            for (String word : words) {
                int count = 0;
                for (char ch : word.toCharArray()) {
                    if (ch == c) {
                        count++;
                    }
                }
                minCount = Math.min(count, minCount);
                if (minCount == 0) {
                    break;
                }
            }
            for (int i = 0; i < minCount; i++) {
                res.add(String.valueOf(c));
            }
        }
        return res;
    }
}
// @lc code=end
