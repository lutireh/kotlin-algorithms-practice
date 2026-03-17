/* 
 * Problem:
 * You are given a string allowed consisting of distinct characters and an array of strings words. 
 * A string is consistent if all characters in the string appear in the string allowed.
 * Return the number of consistent strings in the array words.
 *
 * Approach:
 * Iterate through each word and check if all its characters are present in the allowed string. 
 * Count the word as consistent only if all characters are valid.
 * 
 * Time Complexity: O(n · m · k)
 * Space Complexity: O(1)
 */

 class Solution {
    fun countConsistentStrings(allowed: String, words: Array<String>): Int {
        var consistent = 0
        var wordsIndex = 0
        val wordsSize = words.size

        while(wordsIndex < wordsSize)  {
            var aux = 0
            val currentWord = words[wordsIndex]
            val currentWordSize = currentWord.length
            var i = 0 
            
            while(i < currentWordSize) {
                if(currentWord[i] in allowed) {
                    aux++
                    i++
                } else {
                    i = currentWordSize
                }
            }
            wordsIndex++
            
            if(aux == currentWordSize) {
                consistent++
            }
        }
        return consistent
    }
}