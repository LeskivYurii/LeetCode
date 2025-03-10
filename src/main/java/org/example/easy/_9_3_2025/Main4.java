package org.example.easy._9_3_2025;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main4 {

    public static void main(String[] args) {

    }

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> contain = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for (int j : nums1) {
            contain.add(j);
        }

        for (Integer j : nums2) {
            if (contain.contains(j)) {
                contain.remove(j);
                result.add(j);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
