package top150.array
/*
80. Remove Duplicates from Sorted Array II
Time: O(n)
Space: O(1)
 */
class RemoveDuplicatesSortedArrayII {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.size < 3) {
            return nums.size
        }
        var k = 0
        var exist = 1
        var currentNumber = nums[0]
        for (i in 1 until nums.size) {
            if (nums[i] == currentNumber && exist < 2) {
                exist++
                k++
            } else if (nums[i] != currentNumber) {
                currentNumber = nums[i]
                exist = 1
                k++
            }
            nums[k] = nums[i]
        }
        return k + 1
    }
}