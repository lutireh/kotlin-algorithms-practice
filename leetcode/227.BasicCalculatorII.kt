/* 
 * Problem:
 * Given a string s which represents an expression, evaluate this expression and return its value. 
 * The integer division should truncate toward zero.
 *
 * You may assume that the given expression is always valid. All intermediate results will be in the range of [-231, 231 - 1].
 *
 * Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().
 *
 * Approach:
 * Iterate through the string while building numbers and applying operations. 
 * Use a variable to track the previous value so multiplication and division can be handled
 * with correct precedence by adjusting the result on the fly.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

 class Solution {
    fun calculate(s: String): Int {
        var i =0
        var cur = 0
        var prev = 0
        var res = 0
        var cur_op = '+'

        while (i < s.length) {
            val cur_char = s[i]

            if(cur_char.isDigit()) {
                while (i < s.length && s[i].isDigit()) {
                    cur = cur * 10 + s[i].digitToInt()
                    i += 1
                }
                i -= 1

                if(cur_op == '+') {
                    res += cur
                    prev = cur
                } else if(cur_op == '-') {
                    res -= cur
                    prev = -cur
                } else if(cur_op == '*') {
                    res -= prev
                    res += prev * cur
                    prev = cur * prev
                } else {
                    res -= prev
                    res += prev / cur
                    prev = prev / cur
                }
                cur = 0
            } else if (cur_char != ' ') {
                cur_op = cur_char
            }
            i += 1
        }
        return res
    }
}