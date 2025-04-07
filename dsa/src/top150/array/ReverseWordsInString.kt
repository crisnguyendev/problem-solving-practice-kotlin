package top150.array

/**
 * 151. Reverse Words in a String
 * Time: O(n)
 * Space: O(1)
 */
class ReverseWordsInString {
    fun reverseWords(s: String): String {
        val charArray = s.toCharArray()
        reverse(charArray, 0, charArray.size - 1)

        var wordStart = 0
        var wordEnd = 0
        var resultIndex = 0

        while (wordEnd < charArray.size) {
            while (wordEnd < charArray.size && charArray[wordEnd] != ' ') {
                wordEnd++
            }
            reverse(charArray, wordStart, wordEnd - 1)

            if (wordStart < wordEnd) {
                if (resultIndex > 0) {
                    charArray[resultIndex] = ' '
                    resultIndex++
                }
                for (i in wordStart until wordEnd) {
                    charArray[resultIndex] = charArray[i]
                    resultIndex++
                }
            }
            wordEnd++
            wordStart = wordEnd
        }

        return String(charArray, 0, resultIndex)
    }

    private fun reverse(array: CharArray, start: Int, end: Int) {
        var left = start
        var right = end
        while (left < right) {
            val temp = array[left]
            array[left] = array[right]
            array[right] = temp
            left++
            right--
        }
    }
}