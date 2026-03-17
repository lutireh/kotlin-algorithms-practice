/* 
 * Problem:
 * Given an array of integers nums and an integer target,
 * return the indices of the two numbers such that they add up to target.
 *
 * Approach:
 * Use a hash map to store the difference between the target and the current number, and use * the index as the key;
 * Loop through the array of numbers with their indices;
 * Save in the hash map the difference between the target and the current number, with the index as the key.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        // Creates a hash map of 2 Ints 
        // [key: index of the number, value: difference between the target and the number]
        val hash = HashMap<Int, Int>()
        // Loop through the array of numbers with their indices
        nums.forEachIndexed { index, num ->
            // Save in the hash map the difference between the target and the current number, with the index as the key 
            hash[target - num]?.let { return intArrayOf(it, index)}
            hash[num] = index
        }
        return intArrayOf()
    }
}