package org.example.medium._26_8_2025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    }

    public String convert(String s, int numRows) {
        List<List<Character>> list = new ArrayList<>();
        for(int r = 0;r<numRows;r++) {
            list.add(new ArrayList<>());
        }
        int n = s.length();
        int i = 0;
        while (i < n) {
            for(int down = 0; down < numRows && i < n; down++) {
                list.get(down).add(s.charAt(i++));
            }
            for(int up = numRows - 2; up > 0 && i < n; up--) {
                list.get(up).add(s.charAt(i++));
            }
        }
        String answ = "";
        for(i=0;i<numRows;i++)
        {
            for(int j=0;j<list.get(i).size();j++)
                answ += list.get(i).get(j);
        }
        return answ;
    }
}
