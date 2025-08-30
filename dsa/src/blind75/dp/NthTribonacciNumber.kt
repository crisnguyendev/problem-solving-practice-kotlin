package blind75.dp

/**
 * 1137. N-th Tribonacci Number
 * Time: O(n)
 * Space: O(n)
 */
class NthTribonacciNumber {
    fun tribonacci(n: Int): Int {
        var values = IntArray(38)
        values[1] = 1
        values[2] = 1
        for(i in 3..n) {
            values[i] = values[i - 1] + values[i - 2] + values [i - 3]
        }
        return values[n]
    }
}