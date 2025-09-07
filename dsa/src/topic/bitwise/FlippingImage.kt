package topic.bitwise

/**
 * 832. Flipping an Image
 * Time: O(n^2)
 * Space: O(1)
 */
class FlippingImage {
    fun flipAndInvertImage(image: Array<IntArray>): Array<IntArray> {
        val n = image.size
        val mid = (n + 1) / 2
        for (i in 0..<n) {
            for (j in 0..<mid) {
                val temp = image[i][j] xor 1
                image[i][j] = image[i][n - j - 1] xor 1
                image[i][n - j - 1] = temp
            }
        }
        return image
    }
}