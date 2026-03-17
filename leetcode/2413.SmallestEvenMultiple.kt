/* 
 * Problem:
 * Given a positive integer n, return the smallest positive integer that is a multiple of both 2 and n.
 *
 * Approach:
 * Return n if it is even; otherwise, return 2 * n to get the smallest even multiple.
 * 
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

 class Solution {
    fun smallestEvenMultiple(n: Int): Int {
        return if (n % 2 == 0) { n } else { n * 2 }
    }
}