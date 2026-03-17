/* Company Revenue Report
Problem: You are given a large string representing the contents of a CSV file.
Each line represents a company registered in a payment platform.

Each row has the format: companyId,companyName,country,transactionCount,totalRevenue

Where:

companyId → unique identifier of the company
companyName → name of the company
country → country where the company operates
transactionCount → number of transactions processed
totalRevenue → total revenue processed (in cents)

Your task:

Implement a function that:
1. Parses the CSV string
2. Groups companies by country
3. Calculates the total revenue per country
4️. Returns the country with the highest total revenue
*/

import java.io.BufferedReader
import java.io.InputStreamReader

data class Company(
    val companyId: String?,
    val companyName: String?,
    val country: String?,
    val transactionCount: Int?,
    val totalRevenue: Int?
)

fun checkHighestRevenueContry(companies: List<Company>) : String {
    val byCountry = companies.groupBy { it.country }
    val revenuePerCountry = mutableMapOf<String, Int>()
    
    for((country, company) in byCountry) {
        var revenueCount = company.sumOf { it.totalRevenue ?: 0}
        country?.let{
            revenuePerCountry.put(country, revenueCount)
        }
    }
    val maxRevenue = revenuePerCountry.maxBy { it.value }
    return maxRevenue.key
}

fun checkValidCompanies(company: Company) : String? {
    if(company.companyName.isNullOrEmpty() || 
        company.totalRevenue.toString().isNullOrEmpty()) return null
        
    with(company) {
        if (companyId.isNullOrEmpty() ||
            country.isNullOrEmpty() || 
            transactionCount.toString().isNullOrEmpty()) {
                return "INVALID COMPANY:  ${companyName}"
            } else {    
                return "VALID COMPANY:    ${companyName}"
        }
    }
}

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    var line: String?
    val companyList = mutableListOf<Company>()
    
    while (reader.readLine().also { line = it } != null) {    
        val splited = line.toString().split(",")
        companyList.add(
            Company(
                companyId = splited[0],
                companyName = splited[1],
                country = splited[2],
                transactionCount = splited[3].toIntOrNull(),
                totalRevenue = splited[4].toIntOrNull()
            )
        )
    }
    println("Country with the highest total revenue: ${checkHighestRevenueContry(companyList)}")
    println("\nCOMPANIES REPORT")
    companyList.forEach { println(checkValidCompanies(it)) }
}
