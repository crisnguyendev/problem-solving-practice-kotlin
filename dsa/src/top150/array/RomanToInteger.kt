package top150.array

/**
 * 13. Roman to Integer
 * Time: O(n)
 * Space: O(1)
 */
class RomanToInteger {
    fun romanToInt(s: String): Int {
        var result = 0
        val n = s.length
        for (i in 0 until n) {
            val value = charToInt(s[i])
            if (i + 1 < n && charToInt(s[i + 1]) > value) {
                result -= value
            } else {
                result += value
            }
        }
        return result
    }

    private fun charToInt(char: Char): Int {
        return when (char) {
            'I' -> 1
            'V' -> 5
            'X' -> 10
            'L' -> 50
            'C' -> 100
            'D' -> 500
            'M' -> 1000
            else -> 0
        }
    }
}