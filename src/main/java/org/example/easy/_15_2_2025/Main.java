package org.example.easy._15_2_2025;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("9,8"));
    }

    public static boolean isPalindrome(String s) {
        int leftCount = 0;
        int rightCount = s.length() - 1;

        if(s.isBlank() || s.chars().noneMatch(Character::isLetterOrDigit)) return true;
        s= s.toLowerCase();
        while (leftCount < rightCount) {
            char leftChar = s.charAt(leftCount);
            while (!Character.isLetterOrDigit(leftChar) && leftCount + 1 < s.length()) {
                leftCount++;
                leftChar = s.charAt(leftCount);
            }

            char rightChar = s.charAt(rightCount);
            while (!Character.isLetterOrDigit(rightChar)  && rightCount - 1 >= 0) {
                rightCount--;
                rightChar = s.charAt(rightCount);
            }
            if(Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) return false;
            leftCount++;
            rightCount--;
        }
        return true;
    }

}
