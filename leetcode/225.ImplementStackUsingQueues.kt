/* 
 * Problem:
 * Implement a last-in-first-out (LIFO) stack using only two queues. 
 * The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).
 * 
 * Implement the MyStack class:
 * void push(int x) Pushes element x to the top of the stack.
 * int pop() Removes the element on the top of the stack and returns it.
 * int top() Returns the element on the top of the stack.
 * boolean empty() Returns true if the stack is empty, false otherwise.
 *
 * Approach:
 * Implement a stack using a dynamic array (list). Push adds elements to the end, pop removes the last element, 
 * and top returns the last element. The stack follows LIFO (Last In, First Out) behavior.
 * 
 * Time Complexity: O(1)
 * Space Complexity: O(n)
 */

 class MyStack() {
    var stack = mutableListOf<Int>()

    fun push(x: Int) {
        stack.add(x)
    }

    fun pop(): Int {
        return if(stack.isNotEmpty()){
            stack.removeAt(stack.size - 1)
        } else {
            0
        }
    }

    fun top(): Int {
        return stack[stack.size - 1]
    }

    fun empty(): Boolean {
       return stack.isEmpty()
    }

}

/**
 * Your MyStack object will be instantiated and called as such:
 * var obj = MyStack()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.empty()
 */