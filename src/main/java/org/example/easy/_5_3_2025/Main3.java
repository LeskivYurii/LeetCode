package org.example.easy._5_3_2025;

public class Main3 {

    public static void main(String[] args) {

    }

    public int missingNumber(int[] nums) {
       int size = nums.length;
       int sumNum = 0;
       for(int i = 0; i<= size;i++) {
           sumNum+=i;
       }
       for(int arrElem: nums) {
           sumNum-=arrElem;
       }
       //    return nums.length * (nums.length + 1) / 2 - Arrays.stream(nums).sum();
       return sumNum;
    }
}
