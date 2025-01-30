package org.example.easy._30_1_2025;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }

    public static int lengthOfLastWord(String s) {
        int left = 0;
        int right = 0;
        int letter = 0;
        while (left < s.length() && right < s.length()) {
            if(Character.isLetter(s.charAt(left))) {
                right = left;
                while (right < s.length() && Character.isLetter(s.charAt(right))) {
                    right++;
                }
                letter = right-left;
                left = right;
            }
            left++;
        }
        return letter;
    }
}
