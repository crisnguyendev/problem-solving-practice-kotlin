package top150.array

class ZigzagConversion {
    fun convert(s: String, numRows: Int): String {
        if (numRows == 1) return s

        val lastRowIndex = numRows - 1
        val cycleLength = lastRowIndex * 2
        val result = StringBuilder()

        for (row in 0 until numRows) {
            var index = row
            while (index < s.length) {
                result.append(s[index])
                if (row != 0 && row != lastRowIndex) {
                    val diagonalIndex = index + (lastRowIndex - row) * 2
                    if (diagonalIndex < s.length) {
                        result.append(s[diagonalIndex])
                    }
                }
                index += cycleLength
            }
        }
        return result.toString()
    }
}