/* 
 * Problem:
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 *
 * Approach:
 * I use the first string as an initial prefix candidate and iteratively compare it with each of the remaining strings.
 * For each comparison, I check characters one by one until they differ or I reach the end of one of the strings.
 * I then update the prefix to the common portion found.
 * If at any point there is no common prefix, I return an empty string early.
 * After processing all strings, the remaining prefix is the longest common prefix.
 *
 * Time Complexity: O(n · m) where n is the number of strings and m is the length of the shortest string.
 * Space Complexity: O(1)
 */

 class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""

        if (strs.size == 1) return strs[0]

        var prefix = strs[0]

        for (i in 1 until strs.size) {
            val currentString = strs[i]
            var j = 0
            while (j < prefix.length && j < currentString.length && prefix[j] == currentString[j]) {
                j++
            }
            if (j == 0) return ""
            prefix = prefix.substring(0, j)
        }
        return prefix
    }
}