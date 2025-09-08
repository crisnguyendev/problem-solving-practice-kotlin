package topic.twopointer

/**
 * 1537. Get the Maximum Score
 * Time: O(m + n)
 * Space: O(1)
 */
class GetMaximumScore {
    fun maxSum(nums1: IntArray, nums2: IntArray): Int {
        var p1 = 0
        var p2 = 0
        var sum1 = 0L
        var sum2 = 0L
        val MOD = 1_000_000_007
        while (p1 < nums1.size || p2 < nums2.size) {
            if (p1 < nums1.size && (p2 == nums2.size || nums1[p1] < nums2[p2])) {
                sum1 += nums1[p1]
                p1++
            } else if (p2 < nums2.size && (p1 == nums1.size || nums2[p2] < nums1[p1])) {
                sum2 += nums2[p2]
                p2++
            } else {
                sum1 = maxOf(sum1, sum2) + nums1[p1]
                sum2 = sum1
                p1++
                p2++
            }
        }
        return (maxOf(sum1, sum2) % MOD).toInt()
    }
}