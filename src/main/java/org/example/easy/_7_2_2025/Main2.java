package org.example.easy._7_2_2025;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(climbStairs(2));
    }

    public static int climbStairs(int n) {

        return climbStairs(0,1, n);
    }

    public static int climbStairs(int left, int right, int n) {
        if(n == 1) return left + right;
        return climbStairs(right,left + right, n - 1);
    }

}
