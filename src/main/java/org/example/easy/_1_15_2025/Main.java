package org.example.easy._1_15_2025;

public class Main {
    public static void main(String[] args) {
        isPalindrome(121);
    }

    public static boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
