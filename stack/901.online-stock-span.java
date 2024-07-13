package stack;
/*
 * @lc app=leetcode id=901 lang=java
 *
 * [901] Online Stock Span
 */

// @lc code=start

import java.util.HashMap;
import java.util.Stack;

class StockSpanner {
    Stack<int[]> st;

    public StockSpanner() {
        this.st = new Stack<int[]>();
    }

    public int next(int price) {
        int span = 1;
        while (!st.isEmpty() && price >= st.peek()[0]) {
            span += st.pop()[1];
        }
        st.push(new int[] { price, span });
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
// @lc code=end
