package topic.twopointer

/**
 * 2824. Count Pairs Whose Sum is Less than Target
 * Time: O(nlog(n))
 * Space: O(n)
 */
class CountPairsSumLessThanTarget {
    fun countPairs(nums: List<Int>, target: Int): Int {
        val sortedNums = nums.sorted()
        var left = 0
        var right = nums.size - 1
        var count = 0
        while (left < right) {
            if (sortedNums[left] + sortedNums[right] < target) {
                count += (right - left)
                left++
            } else {
                right--
            }
        }
        return count
    }
}