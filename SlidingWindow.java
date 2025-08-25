
import java.util.Arrays;

public class SlidingWindow {
    public static void main(String[] args) {

        int[] prices = {10,1,5,6,7,1};

        System.out.println("Best Time to Buy and Sell Stock");
        System.out.println("Input: " + Arrays.toString(prices) +
        " Solution: " + SolutionsSlidingWindow.maxProfit(prices));

    }

    public class SolutionsSlidingWindow {

        public static int maxProfit(int[] prices){
            /*You are given an integer array prices where prices[i] is the price of NeetCoin on the ith day.
            You may choose a single day to buy one NeetCoin and choose a different day in the future to sell it.
            Return the maximum profit you can achieve. You may choose to not make any transactions, in which case the profit would be 0. */

            int maxP = 0;
            int minBuy = prices[0];

            for (int sell : prices) {
                maxP = Math.max(maxP, sell - minBuy);
                minBuy = Math.min(minBuy, sell);
            }
            return maxP;
        }
    }
}
