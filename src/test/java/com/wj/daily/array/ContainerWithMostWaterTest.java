package com.wj.daily.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContainerWithMostWaterTest {

    ContainerWithMostWater container = new ContainerWithMostWater();

    int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

    @Test
    void maxAreaDoubleLoop() {
        Assertions.assertEquals(49, container.maxAreaDoubleLoop(height));
    }

    @Test
    void maxAreaDoublePointer() {
        Assertions.assertEquals(49, container.maxAreaDoublePointer(height));
    }
}