package org.example.easy._14_3_2025;

import java.util.HashMap;
import java.util.Map;

public class Main4 {

    public static void main(String[] args) {

    }

    public char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < t.length(); i++) {
            map.compute(t.charAt(i), (key, value) -> value == null ? 1 : ++value);
        }

        for(int i = 0; i <s.length(); i++) {
            if (map.get(s.charAt(i)) != null) {
                map.computeIfPresent(s.charAt(i), (key, value) -> value > 0 ? --value : value);
            }
        }

        return map.entrySet().stream().filter(entry -> entry.getValue() > 0).map(Map.Entry::getKey).findFirst().get();
    }
}
