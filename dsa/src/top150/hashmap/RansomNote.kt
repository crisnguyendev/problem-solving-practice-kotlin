package top150.hashmap

class RansomNote {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        var map = mutableMapOf<Char, Int>()
        for (char in magazine) {
            map[char] = map.getOrDefault(char, 0) + 1
        }
        for (char in ransomNote) {
            val count = map.getOrDefault(char, 0)
            if (count == 0) {
                return false
            }
            map[char] = count - 1
        }
        return true
    }
}