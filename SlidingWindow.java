
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
