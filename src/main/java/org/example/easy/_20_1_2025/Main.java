package org.example.easy._20_1_2025;

public class Main {
    public static void main(String[] args) {
        System.out.println(strStr("aaa", "aaa"));
    }
    public static int strStr(String haystack, String needle) {
        int leftPointer = 0;
        int rightPointer = 0;
        if(haystack.length() < needle.length()) {
            return -1;
        }
        while (haystack.length() > leftPointer) {
            if(haystack.charAt(leftPointer) == needle.charAt(rightPointer)) {
                int start = leftPointer;
                while (leftPointer < haystack.length() && haystack.charAt(leftPointer) == needle.charAt(rightPointer)) {
                    if(rightPointer + 1 == needle.length()) {
                        return start;
                    }
                    leftPointer++;
                    rightPointer++;
                }
                leftPointer = start + 1;
                rightPointer = 0;
            } else {
                leftPointer++;
            }
        }
        return -1;
    }

}
