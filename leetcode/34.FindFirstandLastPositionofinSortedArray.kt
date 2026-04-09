/* 
 * Problem:
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
 * If target is not found in the array, return [-1, -1].
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Approach:
 * Since the array is sorted, I use binary search twice: once to find the leftmost occurrence and once for the rightmost. 
 * I slightly modify the conditions to keep searching even after finding the target.
 * 
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

 class Solution {
    fun searchRange(nums: IntArray, target: Int): IntArray {

        fun findFirst(): Int {
            var right = nums.size -1
            var left = 0
            var result = -1

            while(left <= right) {
                val mid = (right+left) / 2

                if(nums[mid] >= target) {
                    right = mid - 1
                } else {
                    left = mid + 1
                }

                if (nums[mid] == target) result = mid
            }
            return result
        }    
        
        fun findLast(): Int {
            var right = nums.size -1
            var left = 0
            var result = -1

            while(left <= right) {
                val mid = (right+left) / 2

                if(nums[mid] <=  target) {
                    left = mid + 1
                } else {
                    right = mid - 1
                }

                if (nums[mid] == target) result = mid
            }
            return result
        }

        return intArrayOf(findFirst(), findLast())
    }
}