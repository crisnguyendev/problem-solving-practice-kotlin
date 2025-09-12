import topic.slidingwindow.FrequencyOfMostFrequentElement
import topic.slidingwindow.SubarrayWithKDifferentInteger

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var nums1 = intArrayOf(1, 2, 1, 2, 3)
    var nums2 = intArrayOf(1, 4, 8, 13)
    var nums3 = intArrayOf(3, 9, 6)
    val result = SubarrayWithKDifferentInteger().subarraysWithKDistinct(nums1, 2)
    println(result)
}