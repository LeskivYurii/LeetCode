package org.example.easy._10_2_2025;

public class Main {
    public static void main(String[] args) {

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int leftPointer = m - 1;
        int rightPointer = n - 1;
        int arrPointer = m + n - 1;
        while (leftPointer >= 0 && rightPointer >= 0) {
            if (nums2[rightPointer] < nums1[leftPointer]) {
                nums1[arrPointer] = nums1[leftPointer];
                leftPointer--;
            } else {
                nums1[arrPointer] = nums2[rightPointer];
                rightPointer--;
            }
            arrPointer--;
        }

        while (leftPointer >= 0) {
            nums1[arrPointer] = nums1[leftPointer];
            leftPointer--;
            arrPointer--;
        }

        while (rightPointer >= 0) {
            nums1[arrPointer] = nums2[rightPointer];
            rightPointer--;
            arrPointer--;
        }
    }
}
