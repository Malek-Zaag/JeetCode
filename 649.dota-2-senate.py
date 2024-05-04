#
# @lc app=leetcode id=649 lang=python3
#
# [649] Dota2 Senate
#

# @lc code=start
from collections import * 
class Solution:
    def predictPartyVictory(self, senate: str) -> str:
        n=len(senate)
        radiant,dire=deque(),deque()
        for i,s in enumerate(senate):
            if s=="R":
                radiant.append(i)
            else : dire.append(i)
        while radiant and dire:
            r,d=radiant.popleft(),dire.popleft()
            if r < d:
                radiant.append(r+n)
            else: dire.append(d+n)
        return "Radiant" if radiant else "Dire"
            
        
# @lc code=end

