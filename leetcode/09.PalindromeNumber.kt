/*
 * Problem:
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 * 
 * Approach:
 * Convert the integer to a string and check if it reads the same backward as forward.
 * 
 * Time Complexity: O(n) where n is the number of digits in the integer.
 * Space Complexity: O(n) for the string representation of the integer.
 */

class Solution {
    fun isPalindrome(x: Int): Boolean {
       val integer = x.toString()
       val reverse = integer.reversed()
       return integer == reverse
    }
}