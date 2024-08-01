package org.example.medium._1_8_2024;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println(maxOperations(new int[] {3,1,5,1,1,1,1,1,2,2,3,2,2}, 1));
    }

    public static int maxOperations(int[] nums, int k) {
        int operations = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < k && map.containsKey(Math.abs(nums[i] - k)) && map.get(Math.abs(nums[i] - k)) >= 1) {
                map.computeIfPresent(Math.abs(nums[i] - k), (key, value) ->  value > 0 ? value - 1 : 0);
                operations++;
            } else {
                map.compute(nums[i], (key, value) -> value == null ? 1 : value + 1);
            }
        }
        return operations;
    }

}
/*
1679. Max Number of K-Sum Pairs
You are given an integer array nums and an integer k.
In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.
Return the maximum number of operations you can perform on the array.

Example 1:

Input: nums = [1,2,3,4], k = 5
Output: 2
Explanation: Starting with nums = [1,2,3,4]:
- Remove numbers 1 and 4, then nums = [2,3]
- Remove numbers 2 and 3, then nums = []
There are no more pairs that sum up to 5, hence a total of 2 operations.
Example 2:

Input: nums = [3,1,3,4,3], k = 6
Output: 1
Explanation: Starting with nums = [3,1,3,4,3]:
- Remove the first two 3's, then nums = [1,4,3]
There are no more pairs that sum up to 6, hence a total of 1 operation.
 */
