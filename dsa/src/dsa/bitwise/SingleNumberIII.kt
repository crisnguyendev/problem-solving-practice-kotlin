package dsa.bitwise

/**
 * 260. Single Number III
 * Time: O(n)
 * Space: O(1)
 */
class SingleNumberIII {
    fun singleNumber(nums: IntArray): IntArray {
        var result = 0
        for (num in nums) {
            result = result xor num
        }
        val rightMostBit = result and -result
        var x = 0
        var y = 0
        for (num in nums) {
            if ((num and rightMostBit) == 0) {
                x = x xor num
            } else {
                y = y xor num
            }
        }
        return intArrayOf(x, y)
    }
}