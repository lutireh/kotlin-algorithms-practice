/* You are given a list of transactions.

Each transaction has:

id (string)

amount (integer, positive or negative)

merchant (string)

Your task is to:

Return the merchant with the highest total spending (only negative amounts count as spending).

 { "id": "t1", "amount": -50, "merchant": "Amazon" },
  { "id": "t2", "amount": -20, "merchant": "Uber" },
  { "id": "t3", "amount": -30, "merchant": "Amazon" },
  { "id": "t4", "amount": 100, "merchant": "Salary" }
*/

data class Transaction(
    val id: String,
    val merchant: String,
    val amount: Int
)

fun findHighestTotalSpending(transactions: List<Transaction>) : String {
    val amountByMerchant = transactions
                        .filter { it.amount < 0}
                        .groupBy { it.merchant }
                        .mapValues { (_, transaction) -> transaction.sumOf { it.amount }}
        
    if(amountByMerchant.isEmpty()) {
        throw Exception("Empty List")
    }
    return amountByMerchant.minBy { it.value }.key
}


fun main(args: Array<String>) {
    val transactions = listOf(
        Transaction("t1", "Amazon", -50),
        Transaction("t2", "Uber", -20),
        Transaction("t3", "Amazon", -30),
        Transaction("t4", "Salary", 100),
 
    )
    println(findHighestTotalSpending(transactions))
}