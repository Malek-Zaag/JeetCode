/*
 * @lc app=leetcode id=933 lang=java
 *
 * [933] Number of Recent Calls
 */

// @lc code=start

import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    public Queue<Integer> requests;

    public RecentCounter() {
        this.requests = new LinkedList<Integer>();
    }

    public int ping(int t) {
        this.requests.add(t);
        while (t - this.requests.peek() > 3000) {
            this.requests.poll();
        }
        return this.requests.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
// @lc code=end
