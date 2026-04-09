/* 
 * Problem:
 * There is an integer array nums sorted in ascending order (with distinct values).
 * Prior to being passed to your function, nums is possibly left rotated at an unknown 
 * index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., 
 * nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be left rotated by 3 indices and become [4,5,6,7,0,1,2].
 * Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Approach:
 * Brute force first, ignoring the O(log n) requirement, we can simply iterate through the array 
 * and return the index of the target if found, otherwise return -1;
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

 /*class Solution {
    fun search(nums: IntArray, target: Int): Int {
        for (n in nums.indices) {
            if(nums[n] == target){
                return n
            }
        }
        return -1
    }
}

 * Approach:
 * Optimized approach, Even though the array is rotated, at least one half is always sorted. 
 * I use binary search to identify the sorted half and check if the target lies within it, 
 * reducing the search space by half each time.
 * 
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var right = nums.size -1
        var left = 0

        while(left <= right) {
            val mid = (right + left) / 2
            if (nums[mid] == target) return mid

            if(nums[left] <= nums[mid]) {
                if(target >= nums[left] && target < nums[mid]) {
                    right = mid - 1
                } else {
                    left = mid + 1
                }
            } else {
                if(target > nums[mid] && target <= nums[right]) {
                    left = mid + 1
                } else {
                    right = mid - 1
                }
            }
        }
        return -1
    }
}