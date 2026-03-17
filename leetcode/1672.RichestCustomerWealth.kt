/* 
 * Problem:
 * You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer ha
 * in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
 * 
 * A customer's wealth is the amount of money they have in all their bank accounts. 
 * The richest customer is the customer that has the maximum wealth.
 *
 * Approach:
 * Iterate through each account and compute the total wealth by summing its values. 
 * Track the maximum wealth found and return it at the end.
 * 
 * Current solution (sum()):
 * Time Complexity: O(m · n)
 * Space Complexity: O(1)
 * 
 * Alternative solution (nested loops):
 * Time Complexity: O(m · n)
 * Space Complexity: O(1)
 * 
 * Both approaches have the same time complexity (O(m · n)). 
 * The difference is mainly in readability and constant factors, not Big-O performance.
 */

 class Solution {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        var wealth: Int
        var richest = 0

        // Worse runtime
        // accounts.forEach { customer ->
        //     customer.forEach { value ->
        //         wealth += value
        //     }
        //     if (wealth > richest) {
        //         richest = wealth
        //     }
        //     wealth = 0
        // }

        // Better runtime
        for (i in accounts.indices) {
            wealth = accounts[i].sum()
            if (wealth > richest) {
                richest = wealth
            }
            wealth = 0
        }

        return richest
    }
}