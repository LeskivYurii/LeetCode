package org.example.medium._14_8_2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(equalPairs(new int[][]{{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}}));
    }

    public static int equalPairs(int[][] grid) {
        List<int[]> row = Arrays.asList(grid);
        List<int[]> column = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            int arr[] = new int[grid.length];
            for (int j = 0; j < grid[i].length; j++) {
                arr[j] = grid[j][i];
            }
            column.add(arr);
        }
        for (int[] value : row) {
            for (int[] ints : column) {
                if (Arrays.equals(value, ints)) {
                    count++;
                }
            }

        }
        return count;
    }

}

/*
Equal Row and Column Pairs
Given a 0-indexed n x n integer matrix grid, return the number of pairs (ri, cj) such that row ri and column cj are equal.

A row and column pair is considered equal if they contain the same elements in the same order (i.e., an equal array).

Example 1:


Input: grid = [[3,2,1],[1,7,6],[2,7,7]]
Output: 1
Explanation: There is 1 equal row and column pair:
- (Row 2, Column 1): [2,7,7]
Example 2:


Input: grid = [[3,1,2,2],[1,4,4,5],[2,4,2,2],[2,4,2,2]]
Output: 3
Explanation: There are 3 equal row and column pairs:
- (Row 0, Column 0): [3,1,2,2]
- (Row 2, Column 2): [2,4,2,2]
- (Row 3, Column 2): [2,4,2,2]
 */
