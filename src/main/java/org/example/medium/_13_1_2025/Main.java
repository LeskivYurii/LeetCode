package org.example.medium._13_1_2025;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {


    }
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        char[] chars = s.toCharArray();
        int count = 0;
        int max = 1;
        for(int i = 0; i < chars.length; i++) {
            for(int j = i; j < chars.length; j++) {
                if(set.contains(chars[j])) {
                    max = Math.max(max, count);
                    count = 0;
                    set.clear();
                    break;
                } else {
                    count++;
                    set.add(chars[j]);
                }
        }
        }
        max = Math.max(max, count);
        return max;
    }
}
