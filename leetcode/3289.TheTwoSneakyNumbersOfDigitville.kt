/* 
 * Problem:
 * In the town of Digitville, there was a list of numbers called nums containing integers from 0 to n - 1. 
 * Each number was supposed to appear exactly once in the list, however, 
 * two mischievous numbers sneaked in an additional time, making the list longer than usual.
 * 
 * As the town detective, your task is to find these two sneaky numbers. 
 * Return an array of size two containing the two numbers (in any order), so peace can return to Digitville.
 *
 * Approach:
 * Use a counting array to track the frequency of each number. 
 * When a number appears for the second time, add it to the result array.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

 class Solution {
    fun getSneakyNumbers(nums: IntArray): IntArray {
        val count = IntArray(101)
        val sneakyNumbers = IntArray(2)
        var index = 0

        for (num in nums) {
            count[num]++
            println(count[num])
            if (count[num] == 2) {
                sneakyNumbers[index++] = num
            }
        }
        return sneakyNumbers
    }
}