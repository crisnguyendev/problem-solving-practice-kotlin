package topic.twopointer

/**
 * 321. Create Maximum Number
 * Time:
 * Space:
 */
class CreateMaximumNumber {
    private fun pickMaxSubsequence(digits: IntArray, subseqLength: Int): IntArray {
        if (subseqLength == 0) {
            return IntArray(0)
        }
        var toRemove = digits.size - subseqLength
        val stack = mutableListOf<Int>()
        for (digit in digits) {
            while (toRemove > 0 && stack.isNotEmpty() && stack.last() < digit) {
                stack.removeLast()
                toRemove--
            }
            stack.add(digit)
        }
        return stack.take(subseqLength).toIntArray()
    }

    private fun isGreaterSuffix(seq1: IntArray, i: Int, seq2: IntArray, j: Int): Boolean {
        var p1 = i
        var p2 = j
        while (p1 < seq1.size && p2 < seq2.size && seq1[p1] == seq2[p2]) {
            p1++
            p2++
        }
        if (p2 == seq2.size) {
            return true
        }
        if (p1 < seq1.size && seq1[p1] > seq2[p2]) {
            return true
        }
        return false
    }

    private fun mergeSequences(seq1: IntArray, seq2: IntArray): IntArray {
        var p1 = 0
        var p2 = 0
        val merged = IntArray(seq1.size + seq2.size)
        var m = 0
        while (p1 < seq1.size || p2 < seq2.size) {
            if (isGreaterSuffix(seq1, p1, seq2, p2)) {
                merged[m++] = seq1[p1++]
            } else {
                merged[m++] = seq2[p2++]
            }
        }
        return merged
    }

    fun maxNumber(nums1: IntArray, nums2: IntArray, k: Int): IntArray {
        val m = nums1.size
        val n = nums2.size
        val minDigitsFromNums1 = maxOf(0, k - n)
        val maxDigitsFromNums1 = minOf(k, m)
        var bestSequence = IntArray(0)
        for (digitsFromNums1 in minDigitsFromNums1..maxDigitsFromNums1) {
            val subsequence1 = pickMaxSubsequence(nums1, digitsFromNums1)
            val subsequence2 = pickMaxSubsequence(nums2, k - digitsFromNums1)
            val candidateSequence = mergeSequences(subsequence1, subsequence2)
            if (isGreaterSuffix(candidateSequence, 0, bestSequence, 0)) {
                bestSequence = candidateSequence
            }
        }
        return bestSequence
    }
}