package org.example.easy._9_3_2025;

import java.util.HashSet;
import java.util.Set;

public class Main3 {
    public static void main(String[] args) {

    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> contain = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for (int j : nums1) {
            contain.add(j);
        }

        for (int j : nums2) {
            if (contain.contains(j)) {
                result.add(j);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }


}
