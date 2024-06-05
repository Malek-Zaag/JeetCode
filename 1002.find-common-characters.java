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
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        List<String> res = new ArrayList<String>();
        int n = words.length;
        for (int i = 0; i < n; i++) {
            int m = words[i].length();
            for (int j = 0; j < m; j++) {
                map.put(words[i].charAt(j), map.getOrDefault(words[i].charAt(j), 0) + 1);
            }
        }
        for (char i : map.keySet()) {
            if (map.get(i) >= 2 * n) {
                res.add(String.valueOf(i));
                res.add(String.valueOf(i));
            } else if (map.get(i) >= n) {
                res.add(String.valueOf(i));
            }
        }
        return res;
    }
}
// @lc code=end
