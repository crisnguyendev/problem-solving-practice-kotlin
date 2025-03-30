package top150.array

/**
 * 189. Rotate Array
 * Time: O(n)
 * Space: O(1)
 */
class RotateArray {
    fun rotate(nums: IntArray, k: Int): Unit {
        val l = k % nums.size
        rotate(nums, 0, nums.size - 1)
        rotate(nums, 0, l - 1)
        rotate(nums, l, nums.size - 1)
    }

    fun rotate(nums: IntArray, start: Int, end: Int): Unit {
        var p1 = start
        var p2 = end
        while (p1 < p2) {
            var temp = nums[p1]
            nums[p1] = nums[p2]
            nums[p2] = temp
            p1++
            p2--
        }
    }
}