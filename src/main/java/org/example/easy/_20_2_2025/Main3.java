package org.example.easy._20_2_2025;

public class Main3 {

    public static void main(String[] args) {
        System.out.println(titleToNumber("AB"));
    }

    public static  int titleToNumber(String columnTitle) {
        int result = 0;
        for(int i = 0; i < columnTitle.length(); i++) {
            char ch = columnTitle.charAt(i);
            result *=26;
             result+= (ch - 'A' + 1);
        }
        return result;
    }
}
