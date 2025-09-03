package dsa.bitwise

/**
 * 1863. Sum of All Subset XOR Totals
 * Time: O(nlogn)
 * Space: O(1)
 */
class SumAllSubsetXORTotals {
    fun subsetXORSum(nums: IntArray): Int {
        var result = 0
        val n = nums.size
        for (bit in 0..<32) {
            var count = 0
            for (num in nums) {
                if ((num and (1 shl bit)) != 0) {
                    count++
                }
            }
            if (count > 0) {
                result += (1L shl (n - 1 + bit)).toInt()
            }
        }
        return result
    }
}