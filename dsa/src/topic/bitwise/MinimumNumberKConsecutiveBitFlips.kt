package topic.bitwise

/**
 * 995. Minimum Number of K Consecutive Bit Flips
 * Time: O(n)
 * Space: O(k)
 */
class MinimumNumberKConsecutiveBitFlips {
    fun minKBitFlips(nums: IntArray, k: Int): Int {
        val n = nums.size
        val flipTrackQueue = ArrayDeque<Int>()
        var isFlipped = 0
        var totalFlips = 0
        for (i in 0..<n) {
            if (i >= k) {
                isFlipped = isFlipped xor flipTrackQueue.removeFirst()
            }
            if (isFlipped % 2 == nums[i]) {
                if (i + k > n) return -1
                flipTrackQueue.addLast(1)
                isFlipped = isFlipped xor 1
                totalFlips++
            } else {
                flipTrackQueue.addLast(0)
            }
        }
        return totalFlips
    }
}