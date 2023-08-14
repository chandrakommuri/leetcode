package com.chandra.leetcode;

public class MergeSortedArray {
    /**
     * <a href="https://leetcode.com/problems/merge-sorted-array/">88. Merge Sorted Array</a>
     * <ol>
     * <li>Start comparing elements from the last index. i.e, m-1, n-1</li>
     * <li>Copy the bigger element to the end of nums1. i.e, m+n-i</li>
     * <li>If there are any residual elements in nums2, just copy it to nums1</li>
     * </ol>
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) return;
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }

    }
}
