package org.example.easy._14_2_2025;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            if (result.isEmpty()){
                row.add(1);
            }
            else {
                List<Integer> previousRow = result.get(i - 1);
                row.add(1);
                for(int j = 1; j < previousRow.size(); j++) {
                    row.add(previousRow.get(j - 1) + previousRow.get(j));
                }
                row.add(1);
            }
            result.add(row);
        }
        return result;
    }
}
