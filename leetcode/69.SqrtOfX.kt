/* 
 * Problem:
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer. 
 * The returned integer should be non-negative as well.
 * You must not use any built-in exponent function or operator.
 * For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 *
 * Approach:
 * Use binary search to find the integer square root. Search within the range [1, x] 
 * and compare mid² with x to adjust the search space. Return the largest value whose square is less than or equal to x.
 * 
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

 class Solution {
    fun mySqrt(x: Int): Int {
        if (x == 0 || x == 1) return x

        var start: Long = 1
        var end: Long  = x.toLong()

        while (start <= end) {
            val mid: Long = start + (end - start) / 2

            if ((mid * mid) == x.toLong()) {
                return mid.toInt()
            } else if((mid * mid) < x.toLong()){
                start = mid + 1
            } else {
                end = mid - 1
            }
        }
        return end.toInt()
    }
}