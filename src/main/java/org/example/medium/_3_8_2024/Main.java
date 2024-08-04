package org.example.medium._3_8_2024;

public class Main {

    public static void main(String[] args) {
        System.out.println(maxVowels("aeiou", 2));
    }

    public static int maxVowels(String s, int k) {
        StringBuilder str = new StringBuilder(s.substring(0, k));
        String vowel = "aeiouAEIOU";
        int max;
        int count = 0;
        for(int j = 0; j < str.length(); j++) {
            if(vowel.contains(""+ str.charAt(j))) {
                count++;
            }
        }
        max = count;
        for(int i = k; i < s.length(); i++) {
          str.append(s.charAt(i));
          if(vowel.contains(""+ str.charAt(k))) {
              count++;
          }

          if(vowel.contains("" + str.charAt(0))) {
              count--;
          }
          str.deleteCharAt(0);
          max = Math.max(max, count);
        }

        return max;
    }
}

/*
Maximum Number of Vowels in a Substring of Given Length
Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.

Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

Example 1:

Input: s = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.
Example 2:

Input: s = "aeiou", k = 2
Output: 2
Explanation: Any substring of length 2 contains 2 vowels.
Example 3:

Input: s = "leetcode", k = 3
Output: 2
Explanation: "lee", "eet" and "ode" contain 2 vowels.
 */