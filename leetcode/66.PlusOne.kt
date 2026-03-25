/* 
 * Problem:
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. 
 * The digits are ordered from most significant to least significant in left-to-right order. 
 * The large integer does not contain any leading 0's.
 * Increment the large integer by one and return the resulting array of digits.
 *
 * Approach:
 * Traverse the array from the last digit to the first;
 * If the current digit is less than 9, increment it by one and return the array;
 * If the current digit is 9, set it to 0 and continue to the next digit (carry over);
 * If all digits are processed and were 9, create a new array with size n + 1;
 * Set the first element of the new array to 1 and leave the rest as 0;
 * Return the new array as the final result.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

 class Solution {
    fun plusOne(digits: IntArray): IntArray {
        val size = digits.size

        for (i in size - 1 downTo 0) {
            if (digits[i] < 9) {
                digits[i]++
                return digits
            }
            digits[i] = 0
        }

        val result = IntArray(size + 1)
        result[0] = 1
        return result
    }
}