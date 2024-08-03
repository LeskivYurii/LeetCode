package org.example.easy._2_8_2024;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[] {1,12,-5,-6,50,3}, 4));
    }

    public static double findMaxAverage(int[] nums, int k) {
        double average = Integer.MIN_VALUE;
        double temp = 0;
        int slideDifference = 0;

        for(int index = 0; index < nums.length; index++) {
            temp += nums[index];
            if((index - slideDifference + 1) == k) {
                    average = Math.max(average, temp);
                    temp -= nums[slideDifference];
                    slideDifference++;
                }
            }

        return average/k;
    }
}

/*
 Maximum Average Subarray I
You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value.
Any answer with a calculation error less than 10-5 will be accepted.

Example 1:

Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
Example 2:

Input: nums = [5], k = 1
Output: 5.00000

 */