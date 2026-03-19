/* 
 * Problem:
 * You are given an integer array nums.
 * The alternating sum of nums is the value obtained by adding elements at even indices and subtracting elements at odd indices. 
 * That is, nums[0] - nums[1] + nums[2] - nums[3]...

 * Return an integer denoting the alternating sum of nums.
 *
 * Approach:
 * Iterate through the array and compute the alternating sum by adding elements at even indices and subtracting elements at odd indices.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    fun alternatingSum(nums: IntArray): Int {
        var i = 0
        var result = 0
        val numsSize = nums.size

        while(i < numsSize) {
            if(i % 2 == 0) {
                result += nums[i]
            } else {
                result -= nums[i]
            }
            i++
        }
        return result
    }
}