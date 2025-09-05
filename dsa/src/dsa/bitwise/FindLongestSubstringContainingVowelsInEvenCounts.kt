package dsa.bitwise

/**
 * 1371. Find the Longest Substring Containing Vowels in Even Counts
 *
 */
class FindLongestSubstringContainingVowelsInEvenCounts {
    fun findTheLongestSubstring(s: String): Int {
        val vowelToBit = mapOf('a' to 0, 'e' to 1, 'i' to 2, 'o' to 3, 'u' to 4)
        val seen = HashMap<Int, Int>()
        seen[0] = -1 // Empty prefix has even counts
        var mask = 0
        var maxLength = 0

        for (i in s.indices) {
            if (s[i] in vowelToBit) {
                mask = mask xor (1 shl vowelToBit[s[i]]!!)
            }
            if (mask in seen) {
                maxLength = maxOf(maxLength, i - seen[mask]!!)
            } else {
                seen[mask] = i
            }
        }

        return maxLength
    }
}