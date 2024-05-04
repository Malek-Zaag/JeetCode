#
# @lc app=leetcode id=933 lang=python3
#
# [933] Number of Recent Calls
#

# @lc code=start
from collections import deque
class RecentCounter:


    def __init__(self):
        self.requests=deque()
        
    def ping(self, t: int) -> int:
        self.requests.append(t)
        while t- self.requests[0] > 3000: 
            self.requests.popleft()
        return len(self.requests)


# Your RecentCounter object will be instantiated and called as such:
# obj = RecentCounter()
# param_1 = obj.ping(t)
# @lc code=end

