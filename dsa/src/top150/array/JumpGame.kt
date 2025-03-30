package top150.array

import kotlin.math.max

/**
 * 55. Jump Game
 * Time: O(n)
 * Space: O(1)
 */
class JumpGame {
    fun canJump(nums: IntArray): Boolean {
        var pos = 0
        var nextPos = nums[pos]
        while (pos < nextPos && nextPos <= nums.size - 1) {
            pos++
            nextPos = max(nextPos, pos + nums[pos])
        }
        return nextPos >= nums.size - 1
    }
}