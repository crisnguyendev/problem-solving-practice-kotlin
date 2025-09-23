import topic.heap.MinimumCostConnectStick

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var nums1 = intArrayOf(2, 4, 3)
    var nums2 = intArrayOf(1, 8, 3, 5)
    var nums3 = intArrayOf(5)
    var s = "abacb"
    val result = MinimumCostConnectStick().connectSticks(nums3)
    println(result)
}