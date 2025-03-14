package org.example.easy._14_3_2025;

import java.util.HashMap;
import java.util.Map;

public class Main3 {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
    }

    public static int firstUniqChar(String s) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            map.compute(s.charAt(i) + "", (key, value) -> value == null ? 1 : ++value);
        }

        for(int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i) + "") == 1) {
                return 1;
            }
        }
        return -1;
    }
}
