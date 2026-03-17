/* 
 * Problem:
 * There is a programming language with only four operations and one variable X:
 * 
 * ++X and X++ increments the value of the variable X by 1.
 * --X and X-- decrements the value of the variable X by 1.
 * Initially, the value of X is 0.
 * 
 * Given an array of strings operations containing a list of operations, 
 * return the final value of X after performing all the operations.
 *
 * Approach:
 * Iterate through the operations and update a counter based on whether the operation is increment or decrement.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

 class Solution {
    fun finalValueAfterOperations(operations: Array<String>): Int {
        // Best solution in terms of runtime and memory
        // using String.contains(char) significantly increased runtime

        var x = 0
        var i = 0

        while (i < operations.size) {
            if (operations[i].get(1) == '+') {
                x++
            } else {
                x--
            }
            i++
        }

        return x
    }
}