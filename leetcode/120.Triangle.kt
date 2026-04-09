/* 
 * Problem:
 * Given a triangle array, return the minimum path sum from top to bottom.
 * For each step, you may move to an adjacent number of the row below. More formally, 
 * if you are on index i on the current row, you may move to either index i or index i + 1 on the next row.
 *
 * Approach:
 * first implemented a recursive DFS that explores both possible paths (down and diagonal) from each position, 
 * computing all possible path sums and returning the minimum. 
 * This approach is simple but inefficient because it recomputes overlapping subproblems.
 * 
 * Time Complexity:O(2^n)
 * Space Complexity: O(n)
 */

class Solution {
    // this solution is o(2^n)
    /* fun minimumTotal(triangle: List<List<Int>>): Int {
        return dfs(triangle, 0, 0)
    }

    fun dfs(triangle: List<List<Int>>, row: Int, col: Int): Int {
        if (row == triangle.size - 1) {
            return triangle[row][col] //if there is only one item
        }

        val down = dfs(triangle, row + 1, col) // verticly under
        val diagonal = dfs(triangle, row +1, col+1) //diagonal under

        // pick the minimum
        return triangle[row][col] + minOf(down, diagonal)
    }*/
    
    /* Optimized solution 
     * Approach:
     * Bottom-up dynamic programming approach. I start from the last row and use a DP array to store the minimum path sums,
     * updating it upwards by combining each value with the minimum of its two children. This avoids recomputation entirely.
     * 
     * Time Complexity:O(N^2)
     * Space Complexity: O(n)
     */ 
    
    fun minimumTotal(triangle: List<List<Int>>): Int {
        // take the last row
         // for each row, it overrites the dp putting the sum of the nodes in place
        val dp = triangle.last().toMutableList()

        // Going upwards, removing the dp row and going to the top
        for(row in triangle.size -2 downTo 0) {
            for(col in triangle[row].indices) {
                dp[col] = triangle[row][col] + min(dp[col], dp[col +1])
            }
        }
        return dp[0]
    }
}