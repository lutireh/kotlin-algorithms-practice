/* Top Spender
Problem: Given a list of transactions:

Negative amounts represent spending, positive amounts represent incoming money.

Return the userId that spent the most money.

("u1", -100)
("u2", -50)
("u1", -30)
("u2", 20)
*/

data class Transactions(
    val id: String,
    val amount: Int
)

fun findTheTopSpender(transactions: List<Transactions>) : String {
    val byId = transactions.groupBy { it.id }
    val spentPerId = mutableMapOf<String, Int>()
    
    if(transactions.isEmpty()) { return "Empty List" }
    
    for(id in byId) {
        var amounts = 0
        id.value.forEach { amounts += it.amount }
        spentPerId.put(id.key, amounts)
    }
    
    return spentPerId.entries.minBy { it.value }.key
}

fun main(args: Array<String>) {
    val transactions = listOf(
        Transactions("u1", -100), 
        Transactions("u2", -50),
        Transactions("u1", -30),
        Transactions("u2", -130),
        Transactions("u2", -150),
        
    )
    println(findTheTopSpender(transactions))
}