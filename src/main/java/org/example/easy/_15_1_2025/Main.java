package org.example.easy._15_1_2025;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println(romanToInt("IXX"));
    }
    private static Map<Character, Integer> map = Map.of('I',1,'V',5,'X',10, 'L',50,'C',100, 'D', 500, 'M',1000);
    public static int romanToInt(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if(i + 1 != s.length() && map.get(ch) < map.get(s.charAt(i + 1))) {
                num += (map.get(s.charAt(i + 1)) - map.get(ch));
                i++;
            } else {
                num+=map.get(ch);
            }
        }
        return num;
    }
}
