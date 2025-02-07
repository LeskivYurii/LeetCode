package org.example.easy._7_2_2025;

public class Main {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }

    public static int mySqrt(int x) {
        int num = x;
        int count = 0;
        int oddNumber = 1;
        while(num != 0) {
            num -=oddNumber;
            count++;
            oddNumber +=2;

            if(num < 0) {
                num = 0;
                count--;
            }
        }

        return count;
    }
}
