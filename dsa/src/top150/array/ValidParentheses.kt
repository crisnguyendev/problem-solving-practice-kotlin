package top150.array

import java.util.*

class ValidParentheses {
    fun isValid(s: String): Boolean {
        var stack: Stack<Char> = Stack()
        for (char in s) {
            when (char) {
                '(', '{', '[' -> stack.push(char)
                ')', '}', ']' -> {
                    if (stack.isEmpty()) {
                        return false
                    }
                    val top = stack.pop()
                    if (char != getCloseParentheses(top)) {
                        return false
                    }

                }
            }
        }
        return stack.isEmpty()
    }


    fun getCloseParentheses(char: Char): Char {
        return when (char) {
            '(' -> ')'
            '{' -> '}'
            '[' -> ']'
            else -> ' '
        }
    }
}