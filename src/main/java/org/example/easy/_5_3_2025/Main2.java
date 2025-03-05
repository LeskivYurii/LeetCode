package org.example.easy._5_3_2025;

public class Main2 {

    public static void main(String[] args) {

    }

    public boolean isUgly(int n) {
        if(n < 0) return  false;
        if(n== 1) return true;
        int num = n;
        while (num != 1) {
            if(num%2 == 0) {
                num/=2;
            } else if(num%3==0) {
                num/=3;
            } else if(num%5==0) {
                num/=5;
            } else return false;
        }
        return true;
    }
}
