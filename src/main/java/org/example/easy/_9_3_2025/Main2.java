package org.example.easy._9_3_2025;

public class Main2 {
    public static void main(String[] args) {

    }

    public void reverseString(char[] s) {
        int leftPointer = 0;
        int rightPointer = s.length - 1;
        char temp;
        while (leftPointer < rightPointer) {
            temp = s[leftPointer];
            s[leftPointer] = s[rightPointer];
            s[rightPointer] = temp;
            leftPointer++;
            rightPointer--;
        }
    }
}
