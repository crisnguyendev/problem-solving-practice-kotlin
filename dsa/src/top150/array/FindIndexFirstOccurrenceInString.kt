package top150.array

class FindIndexFirstOccurrenceInString {
    fun strStr(haystack: String, needle: String): Int {
        val n = haystack.length
        val m = needle.length
        for (i in 0 until n) {
            if (i + m <= n && haystack.substring(i, i + m) == needle) {
                return i
            }
        }
        return -1
    }
}