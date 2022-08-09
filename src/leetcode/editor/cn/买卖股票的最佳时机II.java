package leetcode.editor.cn;

import org.junit.Test;

/**
 * 给定一个数组 prices ，其中prices[i] 表示股票第 i 天的价格。
 * <p>
 * 在每一天，你可能会决定购买和/或出售股票。你在任何时候最多只能持有 一股 股票。你也可以购买它，然后在 同一天 出售。
 * 返回 你能获得的 最大 利润。
 * <p>
 * 输入: prices = [7,1,5,3,6,4]
 * 输出: 7
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 3 天（股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。
 * 随后，在第 4 天（股票价格 = 3）的时候买入，在第 5 天（股票价格 = 6）的时候卖出, 这笔交易所能获得利润 = 6-3 = 3
 *
 * @author shkstart
 * @create 2022-04-17 8:37
 */
public class 买卖股票的最佳时机II {
    public int maxProfit(int[] prices) {
        int totalprice = 0;
       if(prices.length < 2){
           return 0;
       }

        for (int i = 1; i < prices.length; i++) {
            if(prices[i] > prices [i-1]){
                totalprice += prices[i] - prices[i-1];
            }else{
                continue;
            }

        }

        return totalprice;

    }

    @Test
    public void test() {
        int[] prices = {2,1,4};
        int maxProfit = maxProfit(prices);
        System.out.println(maxProfit);
    }

}
