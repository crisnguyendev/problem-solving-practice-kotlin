package top150.array

class ReverseWordsInString {
    fun reverseWords(s: String): String {
        val chars = s.toCharArray()
        reverse(chars, 0, chars.size - 1)
        var start = 0
        var end = 0
        var index = 0

        while (end < chars.size) {
            while (end < chars.size && chars[end] != ' ') {
                end++
            }
            reverse(chars, start, end - 1)
            if (start < end) {
                if (index > 0) chars[index++] = ' '
                for (i in start..<end) chars[index++] = chars[i]
            }
            end++
            start = end
        }

        return String(chars, 0, index)
    }

    private fun reverse(chars: CharArray, start: Int, end: Int) {
        var l = start
        var r = end
        while (l < r) {
            val temp = chars[l]
            chars[l] = chars[r]
            chars[r] = temp
            l++
            r--
        }
    }
}