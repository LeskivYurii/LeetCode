package org.example.easy._8_3_2025;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(wordPattern("aba", "dog cat cat"));
    }

    public static boolean wordPattern(String pattern, String s) {
        List<String> strings = Arrays.stream(s.split("\\s")).toList();
        Map<Character, String> chars = new HashMap<>();
        Map<String, Character> strs = new HashMap<>();
        if(pattern.length() != strings.size()) return  false;
        for(int i = 0; i < pattern.length(); i ++) {
            Character ch = pattern.charAt(i);
            String str = strings.get(i);
            if(chars.get(ch) == null && strs.get(str) == null) {
                chars.put(ch, str);
                strs.put(str, ch);
            } else if(chars.get(ch) != null && strs.get(str) != null){
                if(!chars.get(ch).equals(str) || !strs.get(str).equals(ch)) return false;
            } else {
                return false;
            }
        }

        return true;
    }

    public static boolean wordPattern2(String pattern, String s) {
        Map<String, Long> map = pattern.chars().mapToObj(Character::toString).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) ;
        List<String> strings = Arrays.stream(s.split("\\s")).toList();
        Map<String, Long> wordMap = strings.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        if(pattern.length() != strings.size()) return  false;
        Iterator<Map.Entry<String, Long>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Long> patter = iterator.next();
            Map.Entry<String, Long> wordCount = wordMap.entrySet().stream().filter(en -> en.getValue().equals(patter.getValue())).findFirst().orElse(null);
            if(wordCount == null) return false;
            else {
                iterator.remove();
                wordMap.remove(wordCount.getKey());
            }
        }

        return true;
    }

}
