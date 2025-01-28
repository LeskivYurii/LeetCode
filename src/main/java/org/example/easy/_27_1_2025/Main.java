package org.example.easy._27_1_2025;

public class Main {

    public static void main(String[] args) {

    }

    public int removeElement(int[] nums, int val) {
        int leftPointer = 0;
        int rightPointer = 0;
        while (rightPointer < nums.length){
            if(nums[rightPointer] != val) {
                nums[leftPointer++] = nums[rightPointer];
            }
            rightPointer++;
        }
        return leftPointer + 1;
    }
}
