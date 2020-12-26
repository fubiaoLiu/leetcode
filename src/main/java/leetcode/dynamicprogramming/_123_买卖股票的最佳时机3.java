package leetcode.dynamicprogramming;

/**
 * 给定一个数组，它的第 i 个元素是一支给定的股票在第 i 天的价格。
 * 设计一个算法来计算你所能获取的最大利润。你最多可以完成 两笔 交易。
 * 注意: 你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 * <p>
 * 示例 1:
 * 输入: [3,3,5,0,0,3,1,4]
 * 输出: 6
 * 解释: 在第 4 天（股票价格 = 0）的时候买入，在第 6 天（股票价格 = 3）的时候卖出，这笔交易所能获得利润 = 3-0 = 3 。
 *      随后，在第 7 天（股票价格 = 1）的时候买入，在第 8 天 （股票价格 = 4）的时候卖出，这笔交易所能获得利润 = 4-1 = 3 。
 * <p>
 * 示例 2:
 * 输入: [1,2,3,4,5]
 * 输出: 4
 * 解释: 在第 1 天（股票价格 = 1）的时候买入，在第 5 天 （股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。  
 *      注意你不能在第 1 天和第 2 天接连购买股票，之后再将它们卖出。  
 *      因为这样属于同时参与了多笔交易，你必须在再次购买前出售掉之前的股票。
 * <p>
 * 示例 3:
 * 输入: [7,6,4,3,1]
 * 输出: 0
 * 解释: 在这个情况下, 没有交易完成, 所以最大利润为 0。
 * <p>
 * Related Topics 数组 动态规划
 * <p>
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-iii
 *
 * @author Fubiao.Liu
 * @since 2020/12/17 15:03
 **/
public class _123_买卖股票的最佳时机3 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        int lMaxPrice = prices[0];
        int lMinPrice = prices[0];
        int lMaxProfit = 0;
        int[] lmaxs = new int[prices.length];
        lmaxs[0] = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < lMinPrice) {
                lMinPrice = prices[i];
                lMaxPrice = -1;
            } else if (prices[i] > lMaxPrice) {
                lMaxPrice = prices[i];
            }
            lMaxProfit = lmaxs[i] = Math.max(lMaxProfit, lMaxPrice - lMinPrice);
        }
        int rMaxPrice = prices[prices.length - 1];
        int rMinPrice = prices[prices.length - 1];
        int rMaxProfit = 0;
//        int[] rmaxs = new int[prices.length];
//        rmaxs[prices.length - 1] = 0;
        int max = 0;
        for (int i = prices.length - 2; i >= 0; i--) {
            if (prices[i] > rMaxPrice) {
                rMaxPrice = prices[i];
                rMinPrice = Integer.MAX_VALUE;
            } else if (prices[i] < rMinPrice) {
                rMinPrice = prices[i];
            }
//            rmaxs[i] = Math.max(rMaxProfit, rMaxPrice - rMinPrice);
            rMaxProfit = Math.max(rMaxProfit, rMaxPrice - rMinPrice);
            max = Math.max(max, lmaxs[i] + rMaxProfit);
        }
        return max;
    }
}