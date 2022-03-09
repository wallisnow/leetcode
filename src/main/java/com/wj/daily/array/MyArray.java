package com.wj.daily.array;

public class MyArray {
    /**
     * @link: https://leetcode-cn.com/problems/move-zeroes/
     *
     * Given an integer array nums, move all 0's to the end of it while maintaining
     * the relative order of the non-zero elements.
     *
     * Note that you must do this in-place without making a copy of the array.
     *
     * Example 1:
     *
     * Input: nums = [0,1,0,3,12]
     * Output: [1,3,12,0,0]
     * Example 2:
     *
     * Input: nums = [0]
     * Output: [0]
     *
     * @date   2022/03/09
     *
     * @param nums an array input
     */
    public void moveZero(int[] nums) {
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                if (i != j) {
                    nums[i] = 0;
                }
                j++;
            }
        }
    }
}
