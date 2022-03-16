package com.wj.daily.array;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClimbingStairsTest {


    ClimbingStairs climbingStairs = new ClimbingStairs();

    long start;

    @BeforeEach
    public void start() {
        start = System.currentTimeMillis();
    }

    @AfterEach
    public void end() {
        System.out.println(System.currentTimeMillis() - start);
    }

    @Test
    void climbStairsRecursiveWithCache() {
        int i = climbingStairs.climbStairsRecursiveWithCache(30);
        Assertions.assertEquals(1346269, i);
    }

    @Test
    void climbStairsRecursive() {
        int i = climbingStairs.climbStairsRecursive(30);
        Assertions.assertEquals(1346269, i);
    }

    @Test
    void climbStairsDP() {
        int i = climbingStairs.climbStairsDP(30);
        Assertions.assertEquals(1346269, i);
    }
}