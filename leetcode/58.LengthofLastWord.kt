/* 
 * Problem:
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 * A word is a maximal substring consisting of non-space characters only.
 *
 * Approach:
 * Start from the end of the string to avoid unnecessary processing;
 * Skip all trailing spaces, since they are not part of the last word;
 * Once a non-space character is found, begin counting the length;
 * Continue moving backwards while the characters are not spaces;
 * Stop when you reach a space or the beginning of the string;
 * Return the counted length as the size of the last word.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

 class Solution {
    fun lengthOfLastWord(s: String): Int {
        var i = s.length - 1
        var length = 0

        while (i >= 0 && s[i] == ' ') {
            i--
        }

        while (i >= 0 && s[i] != ' ') {
            length++
            i--
        }

        return length
    }
}

/* Alternative approach:
 * Split the string into a list of substrings using space as the delimiter;
 * Filter out any empty strings caused by multiple spaces;
 * Access the last element of the filtered list;
 * Return the length of this last word.
 * 
 * Note: This approach is more idiomatic in Kotlin because it leverages built-in collection functions (split, filter),
 * but it is less efficient due to additional memory usage and multiple passes over the data.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * 
 * class Solution {
 *   fun lengthOfLastWord(s: String): Int {
 *       val splitted = s.split(" ")
 *       val filtered = splitted.filter { it != ""}
 *       val i = filtered.size - 1
 *       return filtered[i].length
 *   }
 * }
 */