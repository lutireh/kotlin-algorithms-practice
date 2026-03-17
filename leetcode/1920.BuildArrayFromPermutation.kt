/* 
 * Problem:
 * Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] 
 * for each 0 <= i < nums.length and return it.
 * 
 * A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
 *
 * Approach:
 * Create a new array and fill it such that each position i contains the value nums[nums[i]].
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

 class Solution {
    fun buildArray(nums: IntArray): IntArray {
        val newArray = IntArray(nums.size)
        var i = 0

        nums.forEach {
            newArray[i] = nums[it]
            i++
        }

        return newArray
    }
}