package org.example.medium._5_8_2024;

public class Main {

    public static void main(String[] args) {
        System.out.println(longestSubarray(new int[]{0,1,1,1,0,1,1,0,1}));
    }

    public static int longestSubarray(int[] nums) {
        int left = 0;
        int longestWindow = 0;
        int lastZeroIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
              left = lastZeroIndex + 1;
              lastZeroIndex = i;
            }
            longestWindow  = Math.max(longestWindow, i - left);
        }

        return longestWindow;
    }
}

/*
Longest Subarray of 1's After Deleting One Element
Given a binary array nums, you should delete one element from it.

Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.

Example 1:

Input: nums = [1,1,0,1]
Output: 3
Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.
Example 2:

Input: nums = [0,1,1,1,0,1,1,0,1]
Output: 5
Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1's is [1,1,1,1,1].
Example 3:

Input: nums = [1,1,1]
Output: 2
Explanation: You must delete one element.

Constraints:

1 <= nums.length <= 105
nums[i] is either 0 or 1.
 */