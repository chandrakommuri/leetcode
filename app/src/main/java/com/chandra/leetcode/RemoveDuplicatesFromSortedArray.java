package com.chandra.leetcode;

public class RemoveDuplicatesFromSortedArray {
    /**
     * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/">26. Remove Duplicates from Sorted Array</a>
     * <ol>
     * <li>Define a starting position at 0</li>
     * <li>Initialize a previous element variable to the value beyond input numbers limit</li>
     * <li>Iterate the array from the beginning</li>
     * <li>Update the element at the starting position if the current element is not equal to previous element</li>
     * </ol>
     */
    public int removeDuplicates(int[] nums) {
        int start = 0;
        int prev = -101;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] != prev) {
                nums[start++] = nums[i];
                prev = nums[i];
            }
        }
        return start;
    }
}
