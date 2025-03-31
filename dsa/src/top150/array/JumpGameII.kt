package top150.array

import kotlin.math.max

/**
 * 45. Jump Game II
 * Time: O(n)
 * Space: O(1)
 */
class JumpGameII {
    fun jump(nums: IntArray): Int {
        var jump = 0
        var farthest = 0
        var boundary = 0
        for (i in 0 until nums.size - 1) {
            farthest = max(farthest, i + nums[i])
            if (i == boundary) {
                jump++
                boundary = farthest
            }
        }
        return jump
    }
}