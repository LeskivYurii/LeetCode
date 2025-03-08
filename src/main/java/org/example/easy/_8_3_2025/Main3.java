package org.example.easy._8_3_2025;

public class Main3 {
    private int[] nums = new int[22];
    int count= 1;
    public static void main(String[] args) {

    }
    public Main3(int[] nums) {
        for(int i = 1; i < nums.length; i++) {
            nums[i]= nums[i] + nums[i-1];
        }
        this.nums=nums;
    }

    public int sumRange(int left, int right) {
       if (left == 0){
           return nums[right];
       }
       return nums[right] - nums[left - 1];
    }
}
