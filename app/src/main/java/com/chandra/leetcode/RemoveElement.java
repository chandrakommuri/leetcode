package com.chandra.leetcode;

public class RemoveElement {
    /**
     * <a href="https://leetcode.com/problems/remove-element/">27. Remove Element</a>
     * <ol>
     * <li>Define a starting position at 0</li>
     * <li>Iterate the array from the beginning</li>
     * <li>Update the element at the starting position if the current element is not equal to target value</li>
     * </ol>
     */
    public int removeElement(int[] nums, int val) {
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[start++] = nums[i];
            }
        }
        return start;
    }
}
