package org.example.easy._20_2_2025;

public class Main4 {
    public static void main(String[] args) {
        System.out.println(reverseBits(Integer.parseUnsignedInt("11111111111111111111111111111101", 2)));
    }

    public static int reverseBits(int n) {
        n = ((n & 0b11111111111111110000000000000000) >>> 16) | ((n & 0b00000000000000001111111111111111) << 16);
        n = ((n & 0b11111111000000001111111100000000) >>> 8)  | ((n & 0b00000000111111110000000011111111) << 8);
        n = ((n & 0b11110000111100001111000011110000) >>> 4)  | ((n & 0b00001111000011110000111100001111) << 4);
        n = ((n & 0b11001100110011001100110011001100) >>> 2)  | ((n & 0b00110011001100110011001100110011) << 2);
        n = ((n & 0b10101010101010101010101010101010) >>> 1)  | ((n & 0b01010101010101010101010101010101) << 1);
        return n;
    }
}
