/* 
 * Problem:
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, 
 * or -1 if needle is not part of haystack.
 *
 * Approach:
 * Use the built-in string search function to find the first occurrence of the substring;
 * Pass the main string (haystack) and the target substring (needle);
 * The function scans the string from left to right to locate the substring;
 * If the substring is found, return its starting index;
 * If the substring is not found, return -1.
 * 
 * Time Complexity: O(n * m)
 * Space Complexity: O(1)
 */

 class Solution {
    fun strStr(haystack: String, needle: String): Int {
        return haystack.indexOf(needle)
    }
}