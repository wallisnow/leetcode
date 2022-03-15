package com.wj.daily.array;

public class MoveZero {
    /**
     * @param nums an array input
     * @link: https://leetcode-cn.com/problems/move-zeroes/
     * <p>
     * Given an integer array nums, move all 0's to the end of it while maintaining
     * the relative order of the non-zero elements.
     * <p>
     * Note that you must do this in-place without making a copy of the array.
     * <p>
     * Example 1:
     * Input: nums = [0,1,0,3,12]
     * Output: [1,3,12,0,0]
     * <p>
     * Example 2:
     * Input: nums = [0]
     * Output: [0]
     * @date 2022/03/09
     */
    public void moveZero(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
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
