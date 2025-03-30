package top150.array

/**
 * 122. Best Time to Buy and Sell Stock II
 * Time: O(n)
 * Space: O(1)
 */
class BestTimeBuySellStockII {
    fun maxProfit(prices: IntArray): Int {
        var buy = prices[0]
        var totalProfit = 0
        for (i in 1 until prices.size) {
            if (prices[i] < buy) {
                buy = prices[i]
            } else {
                totalProfit += (prices[i] - buy)
                buy = prices[i]
            }
        }
        return totalProfit
    }
}