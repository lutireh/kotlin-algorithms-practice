/* 
 * Problem:
 * You are given a string s and an integer k.
 * Reverse the first k characters of s and return the resulting string.
 *
 * Approach:
 * Reverse the prefix of length k and concatenate it with the remaining part of the string.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

 class Solution {
    fun reversePrefix(s: String, k: Int): String {
        val prefix = s.substring(0, k).reversed()
        return prefix + s.substring(k)
    }
}