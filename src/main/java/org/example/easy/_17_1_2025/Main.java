package org.example.easy._17_1_2025;

public class Main {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder stringBuilders = new StringBuilder();
        for(int i = 0; i < strs[0].length(); i++) {
            stringBuilders.append(strs[0].charAt(i));
            for(int j = 1; j < strs.length; j++) {
                if(strs[j].indexOf(stringBuilders.toString()) !=0) {
                    stringBuilders.deleteCharAt(stringBuilders.length() - 1);
                    return stringBuilders.toString();
                }
            }
        }
        return stringBuilders.toString();
    }
}
