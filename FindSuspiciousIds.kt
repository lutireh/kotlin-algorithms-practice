/* Detect Suspicious Transactions
Problem: You are given a list of transactions.

Each transaction contains:
- id (String) // id of the transaction
- userId (String) // id of the user
- amount (Int)
- timestamp (Int) — seconds since epoch

A transaction is suspicious if the same user performs two transactions with the same amount within 60 seconds.

Return the list of transaction IDs that are suspicious.

("t1", "u1", 100, 1000)
("t2", "u1", 100, 1040)
("t3", "u2", 50, 2000)
("t4", "u1", 100, 2000)
*/

data class Transaction(
    val id: String,
    val userId: String,
    val amount: Int,
    val timestamp: Int
)

fun findSuspicousIds(transactions: List<Transaction>) : List<String> {
    val suspiciousIds = mutableSetOf<String>()
    val byUserId = transactions.groupBy { it.userId } 
    
    for((userId, transactionsById) in byUserId) {
        val byTimestamp = transactionsById.sortedBy { it.timestamp }
        var left = 0
        
        for(right in byTimestamp.indices) {
            while((byTimestamp[right].timestamp - byTimestamp[left].timestamp) > 60) {
                    left ++
            }
            val windowSize = right - left +1
            
            if (windowSize >= 2) {
                if((transactionsById[right].amount == transactionsById[left].amount)){
                    suspiciousIds.add(userId)
                } else {
                    left++
                }
            }
        }
    }                              
    return suspiciousIds.toList()
}

fun main(args: Array<String>) {
    val transactions = listOf(
        Transaction("t1", "u1", 100, 1000),
        Transaction("t2", "u1", 50, 1040),
        Transaction("t2", "u1", 100, 1100),
        Transaction("t1", "u2", 100, 1000),
        Transaction("t2", "u2", 100, 1040),
        Transaction("t2", "u2", 100, 1100),
        Transaction("t3", "u2", 50, 2000),
        Transaction("t4", "u1", 100, 2000),
    )
    print(findSuspicousIds(transactions))
}