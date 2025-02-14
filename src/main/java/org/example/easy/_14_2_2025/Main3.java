package org.example.easy._14_2_2025;

public class Main3 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{2,1,2,1,0,1,2}));
    }

    public static int maxProfit(int[] prices) {
      int price = prices[0];
      int max = 0;
      for(int i = 1; i < prices.length; i++) {
        if(price > prices[i]) {
            price = prices[i];
        } else if(prices[i] - price > max) {
            max = prices[i] - price;
        }
      }
      return max;
    }
}
