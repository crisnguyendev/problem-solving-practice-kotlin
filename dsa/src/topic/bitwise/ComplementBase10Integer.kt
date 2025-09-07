package topic.bitwise

/**
 * 1009. Complement of Base 10 Integer
 * Time: O(1)
 * Space: O(1)
 */
class ComplementBase10Integer {
    class Solution {
        fun bitwiseComplement(n: Int): Int {
            if (n == 0)
                return 1
            val bitCount = Math.floor(Math.log(n.toDouble()) / Math.log(2.0)).toInt() + 1
            val mask = (1 shl bitCount) - 1
            return n xor mask
        }
    }
}