/* 
 * Problem:
 * You are given a string s. The score of a string is defined as the sum of the absolute difference 
 * between the ASCII values of adjacent characters.
 * Return the score of s.
 *
 * Approach:
 * Iterate through the string and compute the absolute difference 
 * between the ASCII values of consecutive characters, accumulating the result.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

 class Solution {
    fun scoreOfString(s: String): Int {
        if (s.isEmpty() || s.length == 0) return 0

        var result = 0
        var i = 0

        while (i < s.length - 1) {
            var calc = s[i].code - s[i + 1].code
            if (calc < 0) {
                result = result - calc
            } else {
                result = result + calc
            }
            i++
        }

        return result
    }
}