/* 
 * Problem:
 * You are given an integer array nums and an integer k. You can perform the following operation any number of times:
 * Select an index i and replace nums[i] with nums[i] - 1.
 * Return the minimum number of operations required to make the sum of the array divisible by k.
 *
 * Approach:
 * Compute the total sum of the array and return the remainder when divided by k. 
 * This represents the minimum number of operations needed to make the sum divisible by k.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

 class Solution {
    fun minOperations(nums: IntArray, k: Int): Int {

        // Initial approach (iterative reduction)
        // var sum = nums.sum()
        // var operations = 0
        //
        // while (sum % k != 0) {
        //     sum--
        //     operations++
        // }
        // return operations

        // Optimized approach
        return nums.sum() % k
    }
}