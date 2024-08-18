package org.example.medium._16_8_2024;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        System.out.println(decodeString("3[z]2[2[y]pq4[2[jk]e1[f]]]ef"));
    }

    public static String decodeString(String s) {
    Deque<Character> stack = new ArrayDeque<>();
    for (int i = 0; i < s.length(); i++) {
        if(s.charAt(i) == ']') {
            StringBuilder str = new StringBuilder();
            while (!stack.isEmpty() && stack.peek() != '[') {
                str.insert(0, stack.pop());
            }
            stack.pop();
            StringBuilder num = new StringBuilder();
            while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                num.insert(0, stack.pop());
            }
            int repeatCount = Integer.parseInt(num.toString());
            String repeatedString = str.toString().repeat(repeatCount);
            for(Character c : repeatedString.toCharArray()) {
                stack.push(c);
            }
        } else {
            stack.push(s.charAt(i));
        }
    }

    StringBuilder result = new StringBuilder();
    while (!stack.isEmpty()) {
        result.insert(0, stack.pop());
    }

     return result.toString();
    }
}
/*
Decode String
Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly
 k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed,
etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those
repeat numbers, k. For example, there will not be input like 3a or 2[4].

The test cases are generated so that the length of the output will never exceed 105.

Example 1:

Input: s = "3[a]2[bc]"
Output: "aaabcbc"
Example 2:

Input: s = "3[a2[c]]"
Output: "accaccacc"
Example 3:

Input: s = "2[abc]3[cd]ef"
Output: "abcabccdcdcdef"

Constraints:

1 <= s.length <= 30
s consists of lowercase English letters, digits, and square brackets '[]'.
s is guaranteed to be a valid input.
All the integers in s are in the range [1, 300].
 */