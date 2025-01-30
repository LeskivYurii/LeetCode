package org.example.easy._30_1_2025;

public class Main {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[] {1,3,5,6}, 2));
    }

    public static int searchInsert(int[] nums, int target) {
        int result =search(nums, 0, nums.length - 1, target);
        return nums[result] < target ? result + 1 : result;
    }

    public static int search(int[] nums, int left, int right, int target) {
        if(left >= right) {
            return left;
        }
        int edge = left + ((right - left)/2);

        if(nums[edge] == target) {
            return edge;
        }
        if(nums[edge] > target) {
            return search(nums, left, edge - 1, target);
        } else {
            return search(nums, edge + 1, right, target);
        }
    }


}
