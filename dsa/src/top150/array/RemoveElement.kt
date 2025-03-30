package top150.array

//27. Remove Element

class RemoveElement {
    fun removeElement(nums: IntArray, value: Int): Int {
        var p = 0
        for (num in nums) {
            if (num != value) {
                nums[p] = num
                p++
            }
        }
        return p
    }
}