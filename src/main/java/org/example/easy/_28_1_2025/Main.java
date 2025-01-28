package org.example.easy._28_1_2025;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{1,1};
        System.out.println(removeDuplicates(arr));

        System.out.println(Arrays.toString(arr));
    }

    public static int removeDuplicates(int[] nums) {
       int leftPoint = 0;
       int rightPoint = 1;
       while (rightPoint < nums.length) {
           while (rightPoint < nums.length && nums[leftPoint] == nums[rightPoint]) {
                rightPoint++;
           }
           if(rightPoint != nums.length && nums[leftPoint] != nums[rightPoint]) {
               nums[++leftPoint] = nums[rightPoint++];
           }
       }

       return leftPoint + 1;
    }
}
