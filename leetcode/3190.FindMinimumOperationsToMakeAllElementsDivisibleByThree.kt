/* 
 * Problem:
 * You are given an integer array nums. In one operation, you can add or subtract 1 from any element of nums.
 * Return the minimum number of operations to make all elements of nums divisible by 3.
 *
 * Approach:
 * Iterate through the array and count how many elements are not divisible by 3, since each requires one operation.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

 class Solution {
    fun minimumOperations(nums: IntArray): Int {
        var totalOp = 0
        nums.forEach {
            if (it % 3 != 0) totalOp++
        }
        return totalOp
    } 
}