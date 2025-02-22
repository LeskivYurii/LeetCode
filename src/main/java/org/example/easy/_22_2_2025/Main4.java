package org.example.easy._22_2_2025;

import java.util.HashMap;
import java.util.Map;

public class Main4 {
    public static void main(String[] args) {

    }

    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.getOrDefault(nums[i], 0) != 0) {
                return true;
            }
            map.put(nums[i], 1);
        }
        return false;
    }
}
