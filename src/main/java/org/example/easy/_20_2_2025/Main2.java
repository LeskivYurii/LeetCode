package org.example.easy._20_2_2025;

import java.util.HashMap;
import java.util.Map;

public class Main2 {

    public static void main(String[] args) {

    }

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.compute(nums[i], (key, value) -> value == null ? 1 : ++value);
        }

        return map.entrySet().stream().filter(entry -> entry.getValue() > nums.length / 2).map(Map.Entry::getKey).findFirst().orElse(0);
    }
}
