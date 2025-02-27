package org.example.easy._26_2_2025;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(4));
    }

    public static boolean isPowerOfTwo(int n) {
        if (n == 1) return true;
        double num = n;
        while (num >= 2) {
            num/=2;
        }
        return num == 1;
    }

    public boolean isPowerOfTwo(int num, int n) {
        if(num * 2 > n) return false;
        if(num * 2 == n) return true;
        return isPowerOfTwo(num * 2, n);
    }
}
