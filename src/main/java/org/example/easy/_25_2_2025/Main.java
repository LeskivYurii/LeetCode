package org.example.easy._25_2_2025;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(i > k) {
                set.remove(nums[i-k-1]);
            }
            if(!set.add(nums[i])) return true;
        }

        return false;
    }

}
