/* 
 * Problem:
 * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 *
 * Approach:
 * Split the array into two halves and interleave elements from each half to build the result array.
 * 
 * Time Complexity: O(n²)
 * Space Complexity: O(n)
 */

 class Solution {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        var array = intArrayOf()
        val length = nums.size
        var i = 0
        val firstHalf = nums.copyOfRange(0, n)
        val finalHalf = nums.copyOfRange(n, length)

        while (i < n) {
            array = array + firstHalf[i]
            array = array + finalHalf[i]
            i++
        }

        return array
    }
}