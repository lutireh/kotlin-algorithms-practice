/* 
 * Problem:
 * You are given two non-empty linked lists representing two non-negative integers. 
 * The digits are stored in reverse order, and each of their nodes contains a single digit. 
 * Add the two numbers and return the sum as a linked list.
 *
 * Approach:
 * Change the given function to a recursive one, 
 * where the base case is when both lists are null and there is no carry;
 * In each recursive call, we will add the values of the current nodes 
 * of both lists and the carry from the previous call;
 * Calculate the new carry and the value of the current node of the result list;
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?, carry: Int = 0): ListNode? {
        if (l1 == null && l2 == null && carry == 0) return null

        val sum = (l1?.`val` ?: 0) + (l2?.`val` ?: 0) + carry
        val result = ListNode(sum % 10)
        result.next = addTwoNumbers(l1?.next, l2?.next, sum / 10)
        return result
    }
}