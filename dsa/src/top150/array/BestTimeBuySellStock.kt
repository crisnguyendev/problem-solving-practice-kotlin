package top150.array

import kotlin.math.max

/**
 * 121. Best Time to Buy and Sell Stock
 * Time: O(n)
 * Space: O(1)
 */
class BestTimeBuySellStock {
    fun maxProfit(prices: IntArray): Int {
        var buy = prices[0]
        var maxProfit = 0
        for (i in 1 until prices.size) {
            if (prices[i] < buy) {
                buy = prices[i]
            } else {
                maxProfit = max(prices[i] - buy, maxProfit)
            }
        }
        return maxProfit
    }
}