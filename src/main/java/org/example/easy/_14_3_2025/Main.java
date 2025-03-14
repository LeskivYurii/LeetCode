package org.example.easy._14_3_2025;

public class Main {
    public static void main(String[] args) {
        System.out.println(guessNumber(10));
    }

    public static int guessNumber(int n) {
        return guess(1, n);
    }

    public static  int guess(int left, int right) {
        int middle = left + ((right - left + 1) / 2);
        if(guess(middle) == 0) return  middle;
        else if(guess(middle) == - 1)  {
            return guess(middle + 1, right);
        } else  {
            return guess(left, middle - 1);
        }
    }

    public  static int guess(int num) {
        return Integer.compare(num, 6);
    }

}
