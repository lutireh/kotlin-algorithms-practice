/* 
 * Problem:
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 * Approach:
 * Use a stack to track brackets. Push characters as you iterate, and whenever a closing bracket appears, check if it matches the
 * previous opening one. If not, return false. At the end, the stack must be empty for the string to be valid.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

 class Solution {
    fun isValid(s: String): Boolean {
        val parentheses = mapOf(
            ')' to '(',
            ']' to '[', 
            '}' to '{'
        )
        val stack = Stack<Char>()

        s.forEach {
            stack.push(it)

            if (parentheses.containsKey(it)) {
                if ((stack.size < 2) || (stack[stack.size-2] != parentheses[it])) {
                    return false
                }

                stack.pop()
                stack.pop()
            }
        }
    return stack.isEmpty()
    }
}