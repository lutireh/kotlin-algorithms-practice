/* 
 * Problem:
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 * A defanged IP address replaces every period "." with "[.]".
 *
 * Approach:
 * Iterate through the string and build a new one by replacing each '.' with "[.]" while keeping other characters unchanged.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

 class Solution {
    fun defangIPaddress(address: String): String {
        var newString = ""
        val defanged = "[.]"
        var i = 0

        while (i < address.length) {
            if (address[i] == '.') {
                newString = newString + defanged
            } else if (address[i] == ' ') {
                // do nothing
            } else {
                newString = newString + address[i].toString()
            }
            i++
        }

        return newString
    }
}