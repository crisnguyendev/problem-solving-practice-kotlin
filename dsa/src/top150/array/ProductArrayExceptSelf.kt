package top150.array

/**
 * 238. Product of Array Except Self
 * Time:
 * Space:
 */
class ProductArrayExceptSelf {
    fun productExceptSelf(nums: IntArray): IntArray {
        val n = nums.size
        var result: IntArray = IntArray(n)
        result[0] = nums[0]
        for (i in 1 until n) {
            result[i] = nums[i - 1] * result[i - 1]
        }
        var right = 1
        for (i in n - 1 downTo 0 ) {
            result[i] = result[i] * right
            right = right * nums[i]
        }
        return result
    }
}