package org.example.easy._5_3_2025;

public class Main {
    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }

    public static int addDigits(int num) {
        int sum = 0;
        do {
            while (num != 0) {
                sum +=num%10;
                num/=10;
            }
            num = sum;
            sum = 0;
        } while (num/10 != 0);

        return num;
        // return 1+(num-1)%9;
    }
}
