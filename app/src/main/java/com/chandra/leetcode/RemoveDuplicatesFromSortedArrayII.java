package com.chandra.leetcode;

public class RemoveDuplicatesFromSortedArrayII {
    /**
     * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/">80. Remove Duplicates from Sorted Array II</a>
     * <ol>
     * <li>Define a starting position at 2</li>
     * <li>Iterate the array from the position 2</li>
     * <li>Update the element at the starting position if<br/>
     *      - the current element greater than the element at star-2 position</li>
     * </ol>
     */
    public int removeDuplicates(int[] nums) {
        int start = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] > nums[start - 2]) {
                nums[start++] = nums[i];
            }
        }
        return start;
    }
}
