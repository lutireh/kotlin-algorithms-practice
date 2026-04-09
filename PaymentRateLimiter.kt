/* Payment Rate Limiter
Problem: You are building a rate limiter for a payment API.

Each user is allowed to perform at most 3 payments within any 60-second window.

If a user exceeds this limit, the payment must be rejected.

Return:

true → payment allowed
false → payment rejected
*/

val userPayments = mutableMapOf<String, MutableList<Int>>()

fun allowPayment(userId: String, timestamp: Int): Boolean {
    val payments = userPayments.getOrPut(userId) { mutableListOf() }
    payments.removeIf { timestamp - it > 60 }
    if (payments.size >= 3) {
        return false
    } else {
        payments.add(timestamp)
        return true
    }
}

fun main(args: Array<String>) {
    println(allowPayment("u1", 10))
    println(allowPayment("u1", 20))
    println(allowPayment("u1", 30))
    println(allowPayment("u1", 40))
    println(allowPayment("u1", 50))
    println(allowPayment("u2", 50))
    println(allowPayment("u2", 50))
    println(allowPayment("u2", 50))
    println(allowPayment("u2", 50))
}