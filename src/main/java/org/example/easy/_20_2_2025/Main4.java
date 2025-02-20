package org.example.easy._20_2_2025;

public class Main4 {
    public static void main(String[] args) {
        System.out.println(reverseBits(Integer.parseUnsignedInt("11111111111111111111111111111101", 2)));
    }

    public static int reverseBits(int n) {
        int result = 0;
        while(n != 0) {
            result = result + (n & 1);
            n = n >>> 1;
        }
        return result;
    }
}
