package topic.twopointer

/**
 * 3406. Find the Lexicographically Largest String From the Box II
 * Time: O(n)
 * Space: O(1)
 */
class FindLexicographicallyLargestStringFromBoxII {
    fun answerString(word: String, numFriends: Int): String {
        if (numFriends == 1) {
            return word
        }
        val n = word.length
        var i = 0
        var j = i + 1
        while (j < n) {
            var k = 0
            while (j + k < n && word[i + k] == word[j + k]) {
                k++
            }
            if (j + k < n && word[i + k] < word[j + k]) {
                val temp = i
                i = j
                j = maxOf(j + 1, temp + k + 1)
            } else {
                j += (k + 1)
            }
        }
        return word.substring(i, minOf(n, i + n - numFriends + 1))
    }
}