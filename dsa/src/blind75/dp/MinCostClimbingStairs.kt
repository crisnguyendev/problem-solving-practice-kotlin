package blind75.dp

import kotlin.math.cos
import kotlin.math.min

/**
 * 746. Min Cost Climbing Stairs
 * Time: O(n)\
 * Space: O(n)
 */
class MinCostClimbingStairs {
    fun minCostClimbingStairs(cost: IntArray): Int {
        val n = cost.size
        var dp = IntArray(n)
        dp[0] = cost[0]
        dp[1] = cost[1]
        for(i in 2 until n) {
            dp[i] = min(dp[i - 1], dp[i - 2]) + cost[i]
        }
        return min(dp[n - 1], dp[n - 2])
    }
}