/* 
 * Problem:
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 *
 * Approach:
 * Use backtracking to generate all valid combinations. At each step, add an opening or closing parenthesis 
 * while maintaining validity (never allowing more closing than opening). 
 * When no parentheses remain, add the combination to the result.
 * 
 * Time Complexity: O(4ⁿ / √n)
 * Space Complexity: O(n)
 */

 class Solution {
    fun generateParenthesis(n: Int): List<String> {
        val result = mutableListOf<String>()

        // left: number of opening parentheses remaining to be added
        // right: number of closing parentheses remaining to be added
        // current: the string built so far
        verifyParenthesis(n, n, "", result)

        return result
    }

    private fun verifyParenthesis(left: Int, right: Int, current: String, result: MutableList<String>) {
        // Base case: if there are no more parentheses to add
        // and the string is valid, add it to the result
        if (left == 0 && right == 0) {
            result.add(current)
            return
        }

        // if the number of opening parentheses used is greater than closing
        // invalid state
        if (left > right) {
            return
        }

        // try adding an opening parenthesis
        if (left > 0) {
            verifyParenthesis(
                left = left - 1,
                right = right,
                current = "$current(",
                result = result
            )
        }

        // try adding a closing parenthesis
        if (right > 0) {
            verifyParenthesis(
                left = left,
                right = right - 1,
                current = "$current)",
                result = result
            )
        }
    }
}