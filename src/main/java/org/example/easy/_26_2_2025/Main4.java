package org.example.easy._26_2_2025;

import java.util.HashMap;
import java.util.Map;

public class Main4 {
    public static void main(String[] args) {

    }

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            String str = s.charAt(i) +"";
            map.compute(str, (key, value) -> value == null ? 1 : ++value);
        }
        for(int i = 0; i < t.length(); i++) {
            String str = t.charAt(i) + "";
            int value = map.getOrDefault(str, 0);
            if(value == 0) return false;
            map.put(str, --value);
        }
        return true;
    }
}
