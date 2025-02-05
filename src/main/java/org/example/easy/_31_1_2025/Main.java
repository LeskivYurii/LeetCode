package org.example.easy._31_1_2025;

public class Main {
    public static void main(String[] args) {
        System.out.println(addBinary("1101","1011"));
    }

    public static String addBinary(String a, String b) {
        String bigger = a.length() > b.length() ? a : b;
        String smaller = a.length() <= b.length() ? a : b;
        StringBuilder stringBuilder = new StringBuilder();
        int left = 0;
        smaller = "0".repeat(bigger.length() - smaller.length()) + smaller;
        for(int i = bigger.length() - 1; i >= 0; i--) {
            char s;
            if(bigger.charAt(i) == '0' && smaller.charAt(i) == '0') {
                s  = left == 0 ? '0' : '1';
                if(left > 0) {
                    left-=1;
                }
            } else if(bigger.charAt(i) == '1' && smaller.charAt(i) == '1') {
                if(left > 0) {
                    s = '1';
                    left-=1;
                } else {
                    s = '0';
                }
                left+=1;
            } else {
                if(left > 0) {
                    s = '0';
                } else {
                    s = '1';
                }
            }
            stringBuilder.append(s);
        }
        if(left > 0) {
            stringBuilder.append('1');
        }
        return stringBuilder.reverse().toString();
    }

}
