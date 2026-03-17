/* 
 * Problem:
 * You are given an integer array order of length n and an integer array friends.
 * order contains every integer from 1 to n exactly once, 
 * representing the IDs of the participants of a race in their finishing order.
 * friends contains the IDs of your friends in the race sorted in strictly increasing order. 
 * Each ID in friends is guaranteed to appear in the order array.
 * Return an array containing your friends' IDs in their finishing order.
 *
 * Approach:
 * Iterate through the order array and, for each element, check if it exists in the friends array. 
 * If it does, add it to the result in the same order of appearance.
 * 
 * Time Complexity: O(n · m)
 * Space Complexity: O(1) (excluding output)
 */

 class Solution {
    fun recoverOrder(order: IntArray, friends: IntArray): IntArray {
        val finishing = IntArray(friends.size)
        var index = 0

        for (k in order) {
            for (friend in friends) {
                if (k == friend) {
                    finishing[index] = k
                    index++
                    break
                }
            }
        }

        return finishing
    }
}