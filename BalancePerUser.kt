/* Exercise: Calculate Balance per User
Problem: You are given a list of money transfers between users.
Each transfer contains:

- fromUser
- toUser
- amount

Your task is to calculate the final balance for each user.

Rules:

- When a user sends money, their balance decreases.
- When a user receives money, their balance increases.
- Return a map of users and their final balances.

*/

data class Transfer(
    val fromUser: String,
    val toUser: String,
    val amount: Int
)

fun calculateBalancePerUser(transfers: List<Transfer>) : Map<String, Int> {
    val accountsBalances = mutableMapOf<String, Int>()
    
    for(t in transfers) {
        accountsBalances[t.fromUser] = accountsBalances.getOrDefault(t.fromUser, 0) - t.amount
        accountsBalances[t.toUser] = accountsBalances.getOrDefault(t.toUser, 0) + t.amount
    }
    return accountsBalances
}

fun main(args: Array<String>) {
    val transfers = listOf(
        Transfer("Alice", "Bob", 50),
        Transfer("Bob", "Charlie", 20),
        Transfer("Alice", "Charlie", 30)
    )
    println(calculateBalancePerUser(transfers))
}