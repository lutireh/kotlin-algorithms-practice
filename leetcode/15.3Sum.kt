/* 
 * Problem:
 * Given an integer array nums, return all the triplets 
 * [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 * Notice that the solution set must not contain duplicate triplets.
 *
 * Approach:
 * Brute force approach: I iterate through all possible triplets in the array using three nested loops. For each combination, 
 * I check if the sum of the three numbers equals zero. To avoid duplicate triplets, 
 * I sort each valid triplet and store it in a set.
 * 
 * Problem:
 * The main problem of this solution is that it has a time complexity of O(n^3) due to the three nested loops, 
 * which makes it inefficient for large input arrays. Which is why it is not accepted by LeetCode.
 * 
 * Time Complexity: O(n^3)
 * Space Complexity: O(k) where k is the number of unique triplets found.
 */

/* class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val result = mutableSetOf<List<Int>>()
        val n = nums.size

        for (i in 0 until n) {
            for (j in i + 1 until n) {
                for (k in j + 1 until n) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        val triplet = listOf(nums[i],nums[j],nums[k]).sorted()
                        result.add(triplet)
                    }
                }
            }
        }
        return result.toList()
    }
}*/ 

/*  * Approach:
 * Optimized approach: I sort the array and fix one element. 
 * Then I use a two-pointer approach to find pairs that sum to the negative of the fixed value. 
 * I skip duplicates to ensure unique triplets.
 * 
 * Time Complexity: O(n^2)
 * Space Complexity: O(1) if we ignore the output.
 */

class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()
        val result = mutableListOf<List<Int>>()

        for(i in nums.indices) {
            if(i > 0 && nums[i] == nums[i-1]) continue

            var left = i + 1
            var right = nums.size - 1

            while (left < right) {
                val sum = nums[i] + nums[left] + nums[right]

                when {
                    sum == 0 -> {
                        result.add(listOf(nums[i], nums[left], nums[right]))
                        left++
                        right--

                        while(left < right && nums[left] == nums[left-1]) left++
                        while(left < right && nums[right] == nums[right+1]) right--
                    }
                    sum < 0 -> left ++
                    else -> right --
                }
            }
        }
        return result
    }
}

