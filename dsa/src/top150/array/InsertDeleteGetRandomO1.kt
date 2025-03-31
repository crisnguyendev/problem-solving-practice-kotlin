package top150.array

/**
 * 380. Insert Delete GetRandom O(1)
 * Time: O(1)
 * Space: O(n)
 */
class InsertDeleteGetRandomO1 {
    class RandomizedSet() {
        var map = mutableMapOf<Int, Int>()
        var list = mutableListOf<Int>()

        fun insert(value: Int): Boolean {
            if (map[value] != null) {
                return false
            }
            list.add(value)
            map.put(value, list.size - 1)
            return true
        }

        fun remove(value: Int): Boolean {
            if (map[value] == null) {
                return false
            }
            val index = map[value]!!
            val lastElement = list.last()
            list[index] = lastElement
            map[lastElement] = index
            list.removeLast()
            map.remove(value)
            return true
        }

        fun getRandom(): Int {
            return list.random()
        }

    }
}