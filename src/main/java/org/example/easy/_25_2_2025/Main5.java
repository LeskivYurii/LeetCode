package org.example.easy._25_2_2025;

import java.util.ArrayList;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {

    }
    public List<String> summaryRanges(int[] nums) {
        List<String> str = new ArrayList<>();
        String format = "%s->%s";

        for(int i = 0; i < nums.length; i++) {
            int rightCount= i +1;
            if(i < nums.length - 1 && nums[i] + 1 == nums[rightCount]) {
                while (rightCount < nums.length && nums[rightCount - 1] == nums[rightCount] - 1) {
                    rightCount++;
                }
                str.add(format.formatted(nums[i], nums[rightCount - 1]));
                i = --rightCount;
            } else {
                str.add(nums[i] + "");
            }

        }
        return str;
    }
}
