package top150.array

// 27. Remove Element
// Time: O(n)
// Space: O(1)
class MergeSortedArray {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var p1 = m - 1
        var p2 = n - 1
        var p = m + n - 1
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1]
                p1--
            } else {
                nums1[p] = nums2[p2]
                p2--
            }
            p--
        }

        while (p2 >= 0) {
            nums1[p] = nums2[p2]
            p2--
            p--
        }
    }
}