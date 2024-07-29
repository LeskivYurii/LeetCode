package org.example.easy._30_7_2014;

public class Main {

    public static void main(String[] args) {
        System.out.println(isSubsequence("", "aaaaa"));
    }

    public static boolean isSubsequence(String s, String t) {
        int subSequenceIndex = 0;
        if(s.length() > t.length()) {
            return false;
        }
        for (int bigWordIndex = 0; bigWordIndex < t.length() && subSequenceIndex < s.length(); bigWordIndex++) {
            if(t.charAt(bigWordIndex) == s.charAt(subSequenceIndex)) {
                subSequenceIndex++;
            }

        }
        return s.length() == subSequenceIndex;
    }
}

/*
Is Subsequence
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the
 characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "
 abcde" while "aec" is not).

Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false

Constraints:

0 <= s.length <= 100
0 <= t.length <= 104
s and t consist only of lowercase English letters.

Follow up: Suppose there are lots of incoming s, say s1, s2, ..., sk where k >= 109, and you want to check one by one
to see if t has its subsequence. In this scenario, how would you change your code?
 */