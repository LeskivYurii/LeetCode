package org.example.easy._9_3_2025;

public class Main {
    public static void main(String[] args) {

    }

    public boolean isPowerOfFour(int n) {
        if(n < 0) return false;
        if(n == 1) return true;
        if(n % 4 == 0) {
            return isPowerOfFour(n / 4);
        }
        return false;
    }


}
