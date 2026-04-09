/* Transaction Aggregation

You are given a list of transactions.

Each transaction contains:
- id
- userId
- amount

Return the userId with the highest total spending
(only negative amounts count as spending).

("t1", "u1", -100)
("t2", "u2", -50)
("t3", "u1", -20)
("t4", "u2", 30)
*/

data class Transaction(
    val id: String,
    val userId: String,
    val amount: Int
)

fun findTheHighestSpender(transactions: List<Transaction>) : String {
    val byUserId = transactions.groupBy { it.userId }
                                
    val spending = mutableMapOf<String, Int>()
    
    for((userId, transactionByUser) in byUserId) {
        val sumOfTransactions = transactionByUser
                                    .filter { it.amount < 0 }
                                    .sumOf { it.amount }
        spending.put(userId, sumOfTransactions)
    }
    
    return spending.minBy { it.value }.key
}

fun main(args: Array<String>) {
    val transactions = listOf(
        Transaction("t1", "u1", -100),
        Transaction("t2", "u2", -50),
        Transaction("t3", "u1", -20),
        Transaction("t4", "u2", 30),
    )
    println(findTheHighestSpender(transactions))
}