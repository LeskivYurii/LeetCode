package org.example.easy._14_3_2025;

import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {

    }

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < magazine.length(); i++) {
            map.compute(magazine.charAt(i) + "", (key, value) -> value == null ? 1 : ++value);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            String ch = ransomNote.charAt(i) + "";
            if(map.get(ch) == null || map.get(ch) <= 0) {
                return false;
            } else {
                map.computeIfPresent(ch, (key, value) -> --value);
            }
        }

        return true;
    }
}
