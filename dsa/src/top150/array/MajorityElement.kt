package top150.array

/*
169. Majority Element
Time: O(n)
Space: O(1)
 */

class MajorityElement {
    fun majorityElement(nums: IntArray): Int {
        var candidate = nums[0]
        var count = 1
        for (i in 1 until nums.size) {
            if (count == 0) {
                candidate = nums[i]
                count = 1
            } else if (nums[i] == candidate) {
                count++
            } else {
                count--
            }
        }
        return candidate
    }
}