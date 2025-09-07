package topic.array

import kotlin.math.abs

class GreatestCommonDivisorStrings {
    fun gcdOfStrings(str1: String, str2: String): String {
        if(str1 + str2 != str2 + str1)
            return ""
        val max = maxOf(str1.length, str2.length)
        val min = minOf(str1.length, str2.length)
        val gcd = gcd(max, min)
        return str1.substring(0, gcd)
    }

    fun gcd(a: Int, b: Int): Int {
        var a1 = abs(a)
        var b1 = abs(b)
        while (b1 != 0) {
            val temp = b1
            b1 = a1 % b1
            a1 = temp
        }
        return a1
    }
}