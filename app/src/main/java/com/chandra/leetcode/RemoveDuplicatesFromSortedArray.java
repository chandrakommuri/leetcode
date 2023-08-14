package com.chandra.leetcode;

public class RemoveDuplicatesFromSortedArray {
    /**
     * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/">26. Remove Duplicates from Sorted Array</a>
     * <ol>
     * <li>Define a starting position at 1</li>
     * <li>Iterate the array from the position 1</li>
     * <li>Update the element at the starting position if<br/>
     *      - the current element greater than the element at star-1 position</li>
     * </ol>
     */
    public int removeDuplicates(int[] nums) {
        int start = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[start - 1]) {
                nums[start++] = nums[i];
            }
        }
        return start;
    }
}
