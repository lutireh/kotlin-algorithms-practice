/* 
 * Problem:
 * You are given a string date representing a Gregorian calendar date in the yyyy-mm-dd format.
 * date can be written in its binary representation obtained by converting year, month, and day to their binary representations
 * without any leading zeroes and writing them down in year-month-day format.
 * Return the binary representation of date.
 *
 * Approach:
 * Split the date string into year, month, and day, convert each part to an integer, 
 * transform them into binary, and concatenate the results with dashes.
 * 
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

 class Solution {
    fun convertDateToBinary(date: String): String {
        val parts = date.split("-")
        val intYear = parts[0].toInt()
        val intMonth = parts[1].toInt()
        val intDay = parts[2].toInt()

        val binaryYear = Integer.toBinaryString(intYear)
        val binaryMonth = Integer.toBinaryString(intMonth)
        val binaryDay = Integer.toBinaryString(intDay)

        return "$binaryYear-$binaryMonth-$binaryDay"
    }
}