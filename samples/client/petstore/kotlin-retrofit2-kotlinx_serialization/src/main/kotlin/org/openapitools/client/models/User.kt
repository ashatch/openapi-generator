/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import kotlinx.serialization.Serializable as KSerializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual
import java.io.Serializable

/**
 * A User who is purchasing from the pet store
 *
 * @param id 
 * @param username 
 * @param firstName 
 * @param lastName 
 * @param email 
 * @param password 
 * @param phone 
 * @param userStatus User Status
 */
@KSerializable
data class User (

    @SerialName(value = "id")
    val id: kotlin.Long? = null,

    @SerialName(value = "username")
    val username: kotlin.String? = null,

    @SerialName(value = "firstName")
    val firstName: kotlin.String? = null,

    @SerialName(value = "lastName")
    val lastName: kotlin.String? = null,

    @SerialName(value = "email")
    val email: kotlin.String? = null,

    @SerialName(value = "password")
    val password: kotlin.String? = null,

    @SerialName(value = "phone")
    val phone: kotlin.String? = null,

    /* User Status */
    @SerialName(value = "userStatus")
    val userStatus: kotlin.Int? = null

) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

