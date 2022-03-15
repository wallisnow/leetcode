package com.wj.daily.array;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {
    /**
     * You are climbing a staircase. It takes n steps to reach the top.
     * <p>
     * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
     * <p>
     *  
     * <p>
     * Example 1:
     * <p>
     * Input: n = 2
     * Output: 2
     * Explanation: There are two ways to climb to the top.
     * 1. 1 step + 1 step
     * 2. 2 steps
     * Example 2:
     * <p>
     * Input: n = 3
     * Output: 3
     * Explanation: There are three ways to climb to the top.
     * 1. 1 step + 1 step + 1 step
     * 2. 1 step + 2 steps
     * 3. 2 steps + 1 step
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/climbing-stairs
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param n
     * @return
     */

    public Map<Integer, Integer> cache = new HashMap<>();


    public ClimbingStairs() {
        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(3, 3);
    }

    public int climbStairsRecursiveWithCache(int n) {
        if (n <= 2) {
            return n;
        }
        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        int result = climbStairsRecursiveWithCache(n - 1) + climbStairsRecursiveWithCache(n - 2);
        cache.put(n, result);
        return result;
    }

    public int climbStairsRecursive(int n) {
        if (n <= 2) {
            return n;
        }
        return climbStairsRecursive(n - 1) + climbStairsRecursive(n - 2);
    }

    public int climbStairsDP(int n) {
        int[] cache = new int[n + 1];
        cache[0] = 1;
        cache[1] = 1;
        cache[2] = 2;
        cache[3] = 3;
        for (int i = 4; i <= n; i++) {
            cache[i] = cache[i - 2] + cache[i - 1];
        }
        return cache[n];
    }
}
