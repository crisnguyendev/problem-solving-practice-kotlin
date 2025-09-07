package topic.bitwise

/**
 * 136. Single Number
 * Time: O(n)
 * Space: O(1)
 */
class SingleNumber {
    fun singleNumber(nums: IntArray): Int {
        var result = 0
        for (num in nums) {
            result = result xor num
        }
        return result.toInt()
    }
}