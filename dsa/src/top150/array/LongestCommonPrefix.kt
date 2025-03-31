package top150.array

import kotlin.math.min

/**
 * 14. Longest Common Prefix
 * Time: O(n * m)
 * Space: O(1)
 */
class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        val prefix = strs[0]
        var length = prefix.length
        for (str in strs) {
            length = min(length, str.length)
        }
        for (str in strs) {
            while (str.substring(0, length) != prefix.substring(0, length)) {
                length--
                if (length == 0) {
                    return ""
                }
            }
        }
        return prefix.substring(0, length)
    }
}