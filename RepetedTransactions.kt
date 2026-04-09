import java.util.*
import main

/* Given a list of transactions, return the IDs that appear more than once.
  ("t1", 100),
  ("t2", 50),
  ("t1", 100),
  ("t3", 20) */

data class Transacions(
    val id: String,
    val amount: Int
)

fun filteredRepetedIDs(transactions: List<Transacions>): List<String> {
    return transactions
                .groupingBy { it.id to it.amount }
                .eachCount()
                .filter { it.value > 1 }
                .keys
                .map{ it.first }
    }

fun main(args: Array<String>) {
    val transactionsList = listOf(
        Transacions("t1", 100),
        Transacions("t2", 50),
        Transacions("t1", 200),
        Transacions("t3", 20),
        Transacions("t2", 50),
    )
    println(filteredRepetedIDs(transactionsList))
}

// ANOTHER SOLUTION -> using distinct()

/* /* Detect Duplicate Transactions

Problem: Given a list of trasactions

Return the IDs that appear more than once with the same amount.

("t1", 100)
("t2", 50)
("t1", 100)
("t3", 20)
*/

data class Transaction(
    val id: String,
    val amount: Int
)

fun findRepeatedIds(transactions: List<Transaction>) : List<String> {
    val byIds = transactions.groupBy { it.id }
    val repeatedIds = mutableListOf<String>()
    
    if(transactions.isEmpty()) {
        return emptyList()
    }
    
    for((id, transactionsById) in byIds) {
        val distinctSize = transactionsById.distinct().size
        val transactionsSize = transactionsById.size
        if (distinctSize != transactionsSize) {
            repeatedIds.add(id)
        }
    }
    return repeatedIds 
}

fun main(args: Array<String>) {
    val transactions = listOf(
        Transaction("t1",700),
        Transaction("t2",40),
        Transaction("t1",700),
        Transaction("t2",50),
        Transaction("t2",40),
        Transaction("t1",700)
    )
    print(findRepeatedIds(transactions))
} */