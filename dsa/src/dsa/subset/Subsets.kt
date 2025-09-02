package dsa.subset

/**
 * 78. Subsets
 * Time Complexity:
 * Space Complexity:
 */
class Subsets {
    class Solution {
        fun subsets(nums: IntArray): List<List<Int>> {
            val result = mutableListOf<List<Int>>()
            val n = nums.size
            val totalSubsets = 1 shl n

            for (mask in 0..<totalSubsets) {
                val subset = mutableListOf<Int>()
                for (i in 0..<n) {
                    if (mask and (1 shl i) != 0) {
                        subset.add(nums[i])
                    }
                }
                result.add(subset)
            }
            return result
        }
    }
}