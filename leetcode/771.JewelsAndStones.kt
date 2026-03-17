/* 
 * Problem:
 * You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have.
 * Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
 * Letters are case sensitive, so "a" is considered a different type of stone from "A".
 *
 * Approach:
 * Iterate through the stones string and count how many characters are present in the jewels string.
 * 
 * Time Complexity: O(n · m)
 * Space Complexity: O(1)
 */

class Solution {
    fun numJewelsInStones(jewels: String, stones: String): Int {
        var i = 0
        var myJewels = 0

        while(i < stones.length) {
            if(jewels.contains(stones[i])) {
                myJewels++
            }
            i++
        }
        return myJewels
    }
}