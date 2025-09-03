package dsa.bitwise

/**
 * 271. Encode and Decode Strings
 * Time: O(n)
 * Space: O(n)
 */
class EncodeAndDecodeStrings {
    companion object {
        private const val EMPTY_MARKER = "\u0002"
    }

    fun encode(strs: List<String>): String {
        if (strs.isEmpty()) return EMPTY_MARKER
        val encodedString = StringBuilder()
        encodedString.append(strs.size.toChar())
        for (s in strs) {
            val str = s ?: ""
            encodedString.append(str.length.toChar()).append(str)
        }
        return encodedString.toString()
    }

    fun decode(s: String): List<String> {
        if (s.isEmpty() || s == EMPTY_MARKER) return emptyList()
        val decodedString = mutableListOf<String>()
        val numStrings = s[0].code
        if (numStrings <= 0) return decodedString
        var i = 1
        while (i < s.length) {
            val length = s[i].code
            i += 1
            if (length < 0 || i + length > s.length) break
            decodedString.add(s.substring(i, i + length))
            i += length
        }
        return decodedString
    }
}