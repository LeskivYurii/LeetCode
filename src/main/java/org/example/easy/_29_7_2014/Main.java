package org.example.easy._29_7_2014;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = new int[]{0, 1, 0, 3, 12, 13};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeroes(int[] nums) {
        for (int lastNonZeroIndex = 0, cur = 0; cur < nums.length; cur++) {
            if (nums[cur] != 0) {
                int temp = nums[cur];
                nums[cur] = nums[lastNonZeroIndex];
                nums[lastNonZeroIndex++] = temp;
            }
        }
    }
}




/*

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.
0, 1, 0, 3, 12, 13
1, 0, 0, 3, 12, 13
1, 3, 0, 0, 12, 13
1, 3, 12, 0, 0, 13
1, 3, 12, 13, 0, 0
Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
 */