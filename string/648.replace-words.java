/*
 * @lc app=leetcode id=648 lang=java
 *
 * [648] Replace Words
 */

// @lc code=start

import java.util.List;

class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] strArr = sentence.split(" ");
        for (int i = 0; i < dictionary.size(); i++) {
            for (int j = 0; j < strArr.length; j++) {
                if (strArr[j].startsWith(dictionary.get(i))) {
                    System.out.println("up");
                    sentence.replace(strArr[j], dictionary.get(i));
                }
            }
        }
        return sentence;
    }
}
// @lc code=end
