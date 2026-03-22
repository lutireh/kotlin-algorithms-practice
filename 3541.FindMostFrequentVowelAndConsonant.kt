/* 
 * Problem:
 * You are given a string s consisting of lowercase English letters ('a' to 'z').
 * Your task is to:
 * Find the vowel (one of 'a', 'e', 'i', 'o', or 'u') with the maximum frequency.
 * Find the consonant (all other letters excluding vowels) with the maximum frequency.
 * Return the sum of the two frequencies.
 *
 * Note: If multiple vowels or consonants have the same maximum frequency, you may choose any one of them. 
 * If there are no vowels or no consonants in the string, consider their frequency as 0.
 * The frequency of a letter x is the number of times it occurs in the string.
 *
 * Approach:
 * Count the frequency of each character, then iterate through the map to find the maximum frequency among vowels and consonants separately.
 * Return the sum of both values.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

 class Solution {
    fun maxFreqSum(s: String): Int {
        val word = s.lowercase()
        val vowels = setOf('a','e','i','o','u')
        val map = mutableMapOf<Char, Int>()

        for(char in word) {
            map[char] = map.getOrPut(char) { 0 } + 1
        }
        var maxVowel = 0
        var maxConsonant = 0

        for ((char, count) in map) {
            if (char in vowels) {
                maxVowel = maxOf(maxVowel, count)
            } else {
                maxConsonant = maxOf(maxConsonant, count)
            }
        }

        return maxVowel + maxConsonant
    }
}