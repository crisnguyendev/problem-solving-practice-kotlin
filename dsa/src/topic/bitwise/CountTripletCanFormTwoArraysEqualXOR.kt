package topic.bitwise

/**
 * 1442. Count Triplets That Can Form Two Arrays of Equal XOR
 * Time:
 * Space
 */
class CountTripletCanFormTwoArraysEqualXOR {
    fun countTriplets(arr: IntArray): Int {
        var count = 0
        var prefix = 0
        val countMap = mutableMapOf<Int, Int>().apply { put(0, 1) }
        val totalMap = mutableMapOf<Int, Int>()

        for (i in arr.indices) {
            prefix = prefix xor arr[i]
            count += countMap.getOrDefault(prefix, 0) * i - totalMap.getOrDefault(prefix, 0)
            countMap[prefix] = countMap.getOrDefault(prefix, 0) + 1
            totalMap[prefix] = totalMap.getOrDefault(prefix, 0) + (i + 1)
        }
        return count
    }
}