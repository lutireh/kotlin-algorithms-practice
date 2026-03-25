/* 
 * Problem:
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. 
 * If not, return the index where it would be if it were inserted in order.
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Approach:
 * Initialize two pointers: left = 0 and right = last index;
 * While left <= right:
 *   Find the middle index;
 *   If the middle element equals the target, return its index;
 *   If the middle element is less than the target, move left pointer to mid + 1;
 *   Otherwise, move right pointer to mid - 1;
 * When the loop ends, left will be the correct insert position;
 * Return left.
 * 
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1

        while (left <= right) {
            val mid = left + (right - left) / 2

            when {
                nums[mid] == target -> return mid
                nums[mid] < target -> left = mid + 1
                else -> right = mid - 1
            }
        }

        return left
    }
}

/* 
 * Alternative Approach:
 * Without having a O(log n) runtime complexity
 * Initialize a counter variable to track the insert position;
 * Loop through each number in the array;
 * For each element, check if it is less than the target;
 * If it is, increment the counter;
 * Continue until all elements are processed;
 * Return the counter as the index where the target should be inserted.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

/* 
class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var i = 0
        for(n in nums) {
            if(n < target) {
                i++
            }
        }        
        return i
    }
} 
*/