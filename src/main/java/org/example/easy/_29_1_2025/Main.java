package org.example.easy._29_1_2025;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{8,9,9,9})));
    }

    public static int[] plusOne(int[] digits) {
        digits[digits.length - 1] = ++digits[digits.length - 1];
        for(int i = digits.length - 1; i > 0; i--) {
            if(digits[i] == 10) {
                digits[i] = 0;
                digits[i - 1] = ++digits[i - 1];
            }
        }
        if(digits[0] >= 10) {
            int[] newArr = new int[digits.length + 1];
            newArr[0] = 1;
            for(int i = 1; i < newArr.length ; i++) {
                newArr[i] = digits[i - 1];
            }
            newArr[1] = 0;
            return newArr;
        }
        return digits;
    }
}
