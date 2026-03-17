/* 
 * Problem:
 * Given a string s, find the length of the longest substring without duplicate characters.
 *
 * Approach:
 * Sliding Window with a HashMap to store the last seen index of each character.
 * When a repeated character is found within the current window, move the left
 * pointer to the position right after the previous occurrence.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(min(n, k)) -> where k is the size of the character set.
 */

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val hashMap = HashMap<Char, Int>()
        var maxLength = 0
        var left = 0

        for(right in s.indices) {
            val char = s[right]

            // !! significa indice então [char]!! é o indice do char
            if(hashMap.containsKey(char) && hashMap[char]!! >= left) {
                left = hashMap[char]!! +1
            }

            hashMap[char] = right
            maxLength = maxOf(maxLength, right - left + 1)
        }
        return maxLength
    }
}