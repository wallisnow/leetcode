package com.wj.daily.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyArrayTest {

    public MoveZero myArray = new MoveZero();

    @Test
    void testMoveZero() {
        int[] nums = {0, 1, 0, 3, 12};
        myArray.moveZero(nums);
        Assertions.assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
    }
}