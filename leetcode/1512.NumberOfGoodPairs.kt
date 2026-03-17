/* 
 * Problem:
 * Given an array of integers nums, return the number of good pairs.
 * A pair (i, j) is called good if nums[i] == nums[j] and i < j. 
 *
 * Approach:
 * Brute Force: Use a brute-force approach with two pointers to compare all pairs (i, j) 
 * where i < j and count how many have equal values.
 * Recursive: Use recursion to simulate a nested loop over all pairs (i, j). For each pair where i < j, 
 * compare the elements and count matches. When j reaches the end, move i forward and reset j to i + 1.
 * 
 * Time Complexity: O(n²) -> Brute Force
 * Space Complexity: O(1) - > Brute Force
 * Time Complexity: O(n²) -> Recursive
 * Space Complexity: O(n) -> Recursive
 */

 class Solution {

    // Recursive approach
    // fun numIdenticalPairs(nums: IntArray): Int {
    //     return goodPairs(nums, 0, 1)
    // }
    //
    // private fun goodPairs(nums: IntArray, i: Int, j: Int): Int {
    //     if (i >= nums.size) return 0
    //     if (j >= nums.size) return goodPairs(nums, i + 1, i + 2)
    //
    //     val count = if (nums[i] == nums[j]) 1 else 0
    //     return count + goodPairs(nums, i, j + 1)
    // }

    // Brute force approach
    fun numIdenticalPairs(nums: IntArray): Int {
        var i = 0
        var goodPairs = 0

        while (i < nums.size) {
            var j = i + 1

            while (j < nums.size) {
                if (nums[i] == nums[j]) {
                    goodPairs++
                }
                j++
            }

            i++
        }

        return goodPairs
    }

    // Conclusion:
    // The recursive approach may have a better runtime in some cases,
    // but the brute force solution uses less memory.
    // Additionally, the brute force approach is easier to understand and maintain,
    // especially in larger projects.
}