/* 
 * Problem:
 * You are given a 0-indexed integer array nums of size n.
 * Define two arrays leftSum and rightSum where:
 * 
 * leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
 * rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
 * Return an integer array answer of size n where answer[i] = |leftSum[i] - rightSum[i]|.
 *
 * Approach:
 * Compute totalSum of the array.
 * Iterate once:
 * Keep track of leftSum
 * Compute rightSum on the fly: rightSum = totalSum - leftSum - nums[i]
 * Compute absolute difference manually
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

 class Solution {
    fun leftRightDifference(nums: IntArray): IntArray {
        val n = nums.size
        val answer = IntArray(n)

        val totalSum = nums.sum()
        var leftSum = 0

        for (i in nums.indices) {
            val rightSum = totalSum - leftSum - nums[i]
            val difference = leftSum - rightSum
            
            answer[i] = if (difference < 0) -difference else difference

            leftSum += nums[i]
        }

        return answer
    }
}