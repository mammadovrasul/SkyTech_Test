package co.skytech.chat.domain

/**
 * Created by rasulmammadov on 03,May,2022
 */
data class UserCredentials(val language: String, val contract: Contract)

data class Contract(
    val email: String,
    val fullname: String,
    val phone: String,
    val account_type: String,
    val pricing_plan: String
)
