/* 
 * Problem:
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element
 * appears only once. The relative order of the elements should be kept the same.
 * Consider the number of unique elements in nums to be k​​​​​​​​​​​​​​. After removing duplicates, 
 * return the number of unique elements k.
 * The first k elements of nums should contain the unique numbers in sorted order. 
 * The remaining elements beyond index k - 1 can be ignored.
 *
 * Approach:
 * Use a two-pointer approach to overwrite duplicates in-place. 
 * One pointer scans the array while the other tracks the position to insert the next unique element.
 * Each time a new value is found, it is placed at the insert position.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

 class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        if(nums.size == 0) return 0
        var res = 1
        var i = 1

        while(i < nums.size){
            if(nums[i] != nums[i - 1]){
                nums[res] = nums[i]
                res++
            }
            i++
        }
        return res
    }
}