/*
 * @lc app=leetcode id=2486 lang=java
 *
 * [2486] Append Characters to String to Make Subsequence
 */

// @lc code=start
class Solution {
    public int appendCharacters(String s, String t) {
        int i = 0, j = 0;
        int ns = s.length(), nt = t.length();
        while (i < ns && j < nt) {
            if (s.charAt(i) == t.charAt(j)) {
                j++;
            }
            i++;
        }
        return nt - j;
    }
}
// @lc code=end
