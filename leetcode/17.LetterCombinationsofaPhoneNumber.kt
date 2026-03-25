/* 
 * Problem:
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. 
 * Return the answer in any order.
 * 
 * A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 *
 * Approach:
 * Initialize the result list with an empty string to start building combinations;
 * Create a mapping of digits to their corresponding letters;
 * Loop through each digit in the input string;
 * For each digit, get the corresponding letters from the map;
 * For every existing combination, append each possible letter to form new combinations;
 * Store the newly formed combinations in a temporary list;
 * Update the result list with the new combinations after processing each digit;
 * Return the final list containing all possible letter combinations.
 * 
 * Time Complexity: O(4^n)
 * Space Complexity: O(4^n)
 */

class Solution {
    fun letterCombinations(digits: String): List<String> {
        var result = listOf("")
        if(digits.isEmpty()) return result

        val letterMap = mapOf(
            '2' to "abc",
            '3' to "def",
            '4' to "ghi",
            '5' to "jkl",
            '6' to "mno",
            '7' to "pqrs",
            '8' to "tuv",
            '9' to "wxyz"
        )

        for(digit in digits) {
            val letters = letterMap[digit] ?: continue
            val temp = mutableListOf<String>()

            for(combination in result) {
                for(letter in letters) {
                    temp.add(combination + letter)
                }
            }
            result = temp
        }

        return result
    }
}