/* 
 * Problem:
 * You are given an integer array nums. Transform nums by performing the following operations in the exact order specified:
 * 
 * Replace each even number with 0.
 * Replace each odd numbers with 1.
 * Sort the modified array in non-decreasing order.
 * Return the resulting array after performing these operations.
 *
 * Approach:
 * Convert each number to 0 if it is even or 1 if it is odd, then sort the array so all 0s come before 1s.
 * 
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 */

 class Solution {
    fun transformArray(nums: IntArray): IntArray {
        var i = 0
        val size = nums.size
        // accessing .size only once can slightly improve runtime

        while (i < size) {
            if (nums[i] % 2 == 0) {
                nums[i] = 0
            } else {
                nums[i] = 1
            }
            i++
        }

        nums.sort()
        return nums
    }
}