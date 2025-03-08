package org.example.easy._8_3_2025;

public class Main4 {
    public static void main(String[] args) {

    }

    public boolean isPowerOfThree(int n) {
        if(n == 1) return true;
        return isPowerOfThree(n, 3);
    }

    public boolean isPowerOfThree(int n, long num) {
        if (n == num) return true;
        if (n < num) return false;
        return isPowerOfThree(n, num * 3);
    }
}
