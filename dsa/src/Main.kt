import top150.array.BestTimeBuySellStockII

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var nums1 = intArrayOf(7, 1, 5, 3, 6, 4)
    var nums2 = intArrayOf(1, 2, 3, 4, 5)
    var nums3 = intArrayOf(7, 6, 4, 3, 1)
    val result = BestTimeBuySellStockII().maxProfit(nums2)
    println(result)
}