/*
 * @lc app=leetcode id=39 lang=java
 *
 * [39] Combination Sum
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> l = new ArrayList<Integer>();
        for (int i = 0; i < candidates.length; i++) {
            target -= candidates[i];
            for (int j=i;j<candidates.length;j++) {
                target
            }
        }

    }
}
// @lc code=end
