package dsa.twopointer

/**
 * 2444. Count Subarrays With Fixed Bounds
 * Time: O(n)
 * Space: O(1)
 */
class CountSubarraysWithFixedBounds {
    fun countSubarrays(nums: IntArray, minK: Int, maxK: Int): Long {
        var minPos = -1
        var maxPos = -1
        var windowStart = 0
        var count = 0L
        for (i in nums.indices) {
            val num = nums[i]
            if (num < minK || num > maxK) {
                minPos = -1
                maxPos = -1
                windowStart = i + 1
                continue
            }
            if (num == minK) {
                minPos = i
            }
            if (num == maxK) {
                maxPos = i
            }
            if (minPos != -1 && maxPos != -1) {
                count += (minOf(minPos, maxPos) - windowStart + 1).toLong()
            }
        }
        return count
    }
}