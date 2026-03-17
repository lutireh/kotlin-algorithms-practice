/* 
 * Problem:
 * You have n coins and you want to build a staircase with these coins. 
 * The staircase consists of k rows where the ith row has exactly i coins. 
 * The last row of the staircase may be incomplete.
 * Given the integer n, return the number of complete rows of the staircase you will build.
 *
 * Approach:
 * Simulate building rows of coins incrementally. 
 * At each step, subtract the number of coins needed for the next row until there are not enough coins left. 
 * The number of fully completed rows is the result.
 * 
 * Time Complexity: O(√n)
 * Space Complexity: O(1)
 */

class Solution {
    fun arrangeCoins(n: Int): Int {
        var count = 0
        var aux = n 
        while (aux >= 0) {
            count ++
            aux =  aux - count
        }
        return if( count > aux ){ count -1 } else count
    }
}