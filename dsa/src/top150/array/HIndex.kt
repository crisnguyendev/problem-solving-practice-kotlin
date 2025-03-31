package top150.array

/**
 * 274. H-Index
 * Time: O(n)
 * Space: O(n)
 */
class HIndex {
    fun hIndex(citations: IntArray): Int {
        val n = citations.size
        var buckets: IntArray = IntArray(n + 1)
        for (citation in citations) {
            if (citation > n) {
                buckets[n]++
            } else {
                buckets[citation]++
            }
        }
        var totalPaper = 0
        for (i in n downTo 0) {
            totalPaper += buckets[i]
            if (totalPaper >= i) {
                return i
            }
        }
        return -1
    }
}