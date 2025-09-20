import topic.slidingwindow.CountSubarrayWithScoreLessThanK
import topic.slidingwindow.CountSubstringKFrequencyCharacterII

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var nums1 = intArrayOf(2, 1, 4, 3, 5)
    var nums2 = intArrayOf(1, 1, 1)
    var nums3 = intArrayOf(3, 9, 6)
    var s = "abacb"
    val result = CountSubstringKFrequencyCharacterII().numberOfSubstrings(s, 2)
    println(result)
}