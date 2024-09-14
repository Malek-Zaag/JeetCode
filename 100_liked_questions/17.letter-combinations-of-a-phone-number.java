/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        int n = digits.length();
        if (n == 0)
            return result;
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        backtrack(0, "", map, digits, n, result);
        return result;
    }

    private void backtrack(int i, String currStr, Map<Character, String> map, String digits, int n,
            List<String> result) {
        if (i == n) {
            result.add(currStr);
            return;
        } else {
            String letters = map.get(digits.charAt(i));
            for (Character c : letters.toCharArray()) {
                backtrack(i + 1, currStr + c, map, digits, n, result);
            }
        }
    }
}
// @lc code=end
