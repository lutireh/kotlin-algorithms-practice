/* 
 * Problem:
 * You are given a 0-indexed integer array nums and an integer pivot. Rearrange nums such that the following conditions are satisfied:
 * Every element less than pivot appears before every element greater than pivot.
 * Every element equal to pivot appears in between the elements less than and greater than pivot.
 * The relative order of the elements less than pivot and the elements greater than pivot is maintained.
 * More formally, consider every pi, pj where pi is the new position of the ith element and pj is the new position of the jth element. 
 * If i < j and both elements are smaller (or larger) than pivot, then pi < pj.
 * 
 * Return nums after the rearrangement.
 *
 * Approach:
 * Iterate through the array and partition elements into three groups: less than the pivot, equal to the pivot, and greater than the pivot
 * Store each group separately, then concatenate them to form the final result while preserving the original order.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

 class Solution {
    fun pivotArray(nums: IntArray, pivot: Int): IntArray {
        val begining = mutableListOf<Int>()
        val ending = mutableListOf<Int>()
        val middle = mutableListOf<Int>()

        for(num in nums) {
            when {
                num < pivot -> begining.add(num)
                num > pivot -> ending.add(num)
                else -> middle.add(num)
            }
        }

        val result = (begining + middle + ending).toIntArray()
        return result
    }
}