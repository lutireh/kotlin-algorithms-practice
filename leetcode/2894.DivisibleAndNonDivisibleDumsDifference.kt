/* 
 * Problem:
 * You are given positive integers n and m.
 * Define two integers as follows:
 * 
 * num1: The sum of all integers in the range [1, n] (both inclusive) that are not divisible by m.
 * num2: The sum of all integers in the range [1, n] (both inclusive) that are divisible by m.
 * Return the integer num1 - num2.
 *
 * Approach:
 * Iterate from 1 to n and split numbers into two groups: those divisible by m and those not divisible. 
 * Sum both groups separately and return the difference.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

 class Solution {
    fun differenceOfSums(n: Int, m: Int): Int {
        var divisible = 0
        var notDivisible = 0
        var i = 1

        while (i <= n) {
            if (i % m == 0) {
                divisible += i
            } else {
                notDivisible += i
            }
            i++
        }

        return notDivisible - divisible
    }
}