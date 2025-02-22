package org.example.easy._22_2_2025;

public class Main {
    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }

    public static boolean isHappy(int n) {
        int num = n;
        int sum = 0;
        while (sum != 1) {
            sum = 0;
            while (num != 0) {
                sum += (num % 10) * (num % 10);
                num/=10;
            }
            num = sum;
            if(num/ 10 == 0 && num != 7 && num != 1) return false;
        }

        return true;
    }
}
