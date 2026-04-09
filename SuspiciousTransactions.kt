/* You are given a list of transactions.

Each transaction has:
id (string)
amount (integer, positive or negative)
merchant (string)
timestamp (Long)

Implement a fun that detects suspicous transactions and returns a list of suspicious Merchants

A transacion is considered suspicious when:
- the same merchant
- has 3 or more transactions
- in a time range of 60s or less

*/

data class Transaction(
    val id: String,
    val merchant: String,
    val amount: Int,
    val timestamp: Long
)

fun findSuspicousTransactions(transactions: List<Transaction>) : Set<String> {
    val suspicous = mutableSetOf<String>()
    val byMerchant = transactions.groupBy { it.merchant }
    
    for((merchant, transactionsList) in byMerchant) {
        val byTimestamp = transactionsList.sortedBy { it.timestamp }
        
        var left = 0
        
        for(right in byTimestamp.indices) {
            while(transactionsList[right].timestamp - transactionsList[left].timestamp > 60) {
                left++
            }
            
            val windowSize = right - left + 1
            if (windowSize >= 3) {
                suspicous.add(merchant)
                break
            }
        }
    }
    return suspicous
}


fun main(args: Array<String>) {
    val transactions = listOf(
        Transaction("t1", "Amazon", -50, 2000),
        Transaction("t2", "Uber", -20, 1000),
        Transaction("t3", "Amazon", -30, 2010),
        Transaction("t4", "Amazon", -30, 2050),        
        Transaction("t5", "Salary", 100, 250),
    )
    
    println(findSuspicousTransactions(transactions))
}