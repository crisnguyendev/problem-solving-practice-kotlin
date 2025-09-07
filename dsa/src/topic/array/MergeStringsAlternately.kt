package topic.array

class MergeStringsAlternately {
    fun mergeAlternately(word1: String, word2: String): String {
        var result: StringBuilder = StringBuilder()
        var minLength: Int = minOf(word1.length, word2.length)
        for (i in 0 until minLength) {
            result.append(word1[i])
            result.append(word2[i])
        }
        if (word1.length > word2.length) {
            result.append(word1.substring(minLength))
        } else if (word1.length < word2.length) {
            result.append(word2.substring(minLength))
        }
        return result.toString()
    }
}