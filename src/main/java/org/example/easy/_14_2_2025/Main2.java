package org.example.easy._14_2_2025;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        System.out.println(getRow(21));
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i <= rowIndex; i++) {
            result.add((findFactorial(rowIndex).divide(findFactorial(i).multiply(findFactorial(rowIndex - i)))).intValue());
        }
        return result;
    }

    public static BigInteger findFactorial(long num) {
        BigInteger fact = BigInteger.valueOf(1);
        for (int i = 1; i <= num; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
}
