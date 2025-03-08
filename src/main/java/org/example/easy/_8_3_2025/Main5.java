package org.example.easy._8_3_2025;

public class Main5 {

    public static void main(String[] args) {

    }
        public int[] countBits(int n) {
        int[] arr = new int[n + 1];
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                arr[i] = arr[i / 2];
            }else {
                arr[i] = arr[i - 1] + 1;
            }
        }
        return arr;
    }

/*    public int[] countBits(int n) {
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = countOnes(Integer.toBinaryString(i));
        }

        return arr;
    }

    private int countOnes(String num) {
        return (int) num.chars().filter(ch -> ch == 49).count();
    }*/

}
