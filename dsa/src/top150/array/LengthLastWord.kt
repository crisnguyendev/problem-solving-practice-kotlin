package top150.array

/**
 * 58. Length of Last Word
 * Time: O(n)
 * Space: O(1)
 */
class LengthLastWord {
    fun lengthOfLastWord(s: String): Int {
        var i = s.length - 1
        var result = 0
        while (i >= 0 && s[i] == ' ') {
            i--
        }
        while (i >= 0 && s[i] != ' ') {
            i--
            result++
        }
        return result
    }
}