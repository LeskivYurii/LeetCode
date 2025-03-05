package org.example.easy._5_3_2025;

public class Main4 {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(3));
    }

    public static int firstBadVersion(int n) {
        return findBadVersion(1, n);
    }

    private static int findBadVersion(int left, int right) {
        if(left >= right) return left;
        int middle = left + ((right - left)/2);
        return isBadVersion(middle) ? findBadVersion(left, middle): findBadVersion(middle+1, right);
    }

    static  boolean isBadVersion(int version){
        return version == 2;
    }
}
