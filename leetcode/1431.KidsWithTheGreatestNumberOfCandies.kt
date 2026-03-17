/* 
 * Problem:
 * There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies
 * the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
 * 
 * Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, 
 * they will have the greatest number of candies among all the kids, or false otherwise.
 * 
 * Note that multiple kids can have the greatest number of candies.
 *
 * Approach:
 * First, find the maximum number of candies among all kids. Then, iterate again and check for each child 
 * if adding the extra candies makes their total greater than or equal to the maximum, storing the result as a boolean.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

 class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        var max = candies[0]
        candies.forEach {
            max = Math.max(max, it)
        }
        // initially I used candies.max() directly
        // just using .max() significantly increased my runtime
        // using the Math library reduced the runtime a lot

        val list = mutableListOf<Boolean>()
        candies.forEach {
            list.add(it + extraCandies >= max)
        }
        return list
    }
}