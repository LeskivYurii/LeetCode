package org.example.easy._22_2_2025;

import java.util.HashMap;
import java.util.Map;

public class Main3 {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("ab", "aa"));
    }

    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> left = new HashMap<>();
        Map<Character, Integer> right = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            if(!left.getOrDefault(s.charAt(i), 0).equals(right.getOrDefault(t.charAt(i), 0))) {
                return false;
            }
            left.put(s.charAt(i), i + 1);
            right.put(t.charAt(i),i + 1);

        }
        return true;
    }
}
