package dsa.bitwise

/**
 * 2802. Find The K-th Lucky Number
 * Time: O(log(k))
 * Space: O(log(k))
 */
class FindKthLuckyNumber {
    fun kthLuckyNumber(k: Int): String {
        if (k == 0)
            return ""
        val binary = (k + 1).toString(2)
        return binary
            .substring(1)
            .replace('0', '4')
            .replace('1', '7')
    }
}