package org.example.easy._20_2_2025;

public class Main {
    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
    }

    public static String convertToTitle(long columnNumber) {
        StringBuilder stringBuilder = new StringBuilder();
        while (columnNumber != 0) {
            columnNumber--;
            long mod = columnNumber % 26;
            char result = (char) ('A' + mod);
            columnNumber/=26;
            stringBuilder.append(result);
        }

        return stringBuilder.reverse().toString();
    }
}
