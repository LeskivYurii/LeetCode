package org.example.easy._8_3_2025;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(canWinNim(5));
    }

    public static boolean canWinNim(int n) {
        return n%4 != 0;
    }
}
