package top150.array

// 26. Remove Duplicates from Sorted Array
// Time: O(n)
// Space: O(1)
class RemoveDuplicatesSortedArray {
    fun removeDuplicates(nums: IntArray): Int {
        var i = 0
        for (k in 1..<nums.size) {
            if (nums[k] != nums[i]) {
                i++
                nums[i] = nums[k]
            }
        }
        return i + 1
    }
}