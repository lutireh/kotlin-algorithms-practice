/* 
 * Problem:
 * You are given a string s consisting of lowercase English letters.
 * Return an integer denoting the maximum number of substrings you can split s into such that each substring starts 
 * with a distinct character (i.e., no two substrings start with the same character).
 * 
 * Approach:
 * Convert the string into a set to remove duplicate characters and return its size.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

 class Solution {
    fun maxDistinct(s: String): Int {
        return s.toSet().size
    }
}