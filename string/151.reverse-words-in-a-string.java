package string;
/*
 * @lc app=leetcode id=151 lang=java
 *
 * [151] Reverse Words in a String
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        String[] resu = s.trim().split("\\W+");
        for (int i = resu.length - 1; i >= 0; i--) {
            res.append(resu[i]);
            res.append(" ");
        }
        res.deleteCharAt(res.length() - 1);
        return res.toString();
    }
}
// @lc code=end
