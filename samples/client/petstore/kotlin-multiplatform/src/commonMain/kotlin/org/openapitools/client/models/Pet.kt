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

import org.openapitools.client.models.Category
import org.openapitools.client.models.Tag

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * A pet for sale in the pet store
 *
 * @param name 
 * @param photoUrls 
 * @param id 
 * @param category 
 * @param tags 
 * @param status pet status in the store
 */
@Serializable
data class Pet (

    @SerialName(value = "name") @Required val name: kotlin.String,

    @SerialName(value = "photoUrls") @Required val photoUrls: kotlin.collections.List<kotlin.String>,

    @SerialName(value = "id") val id: kotlin.Long? = null,

    @SerialName(value = "category") val category: Category? = null,

    @SerialName(value = "tags") val tags: kotlin.collections.List<Tag>? = null,

    /* pet status in the store */
    @SerialName(value = "status") val status: Pet.Status? = null

) {

    /**
     * pet status in the store
     *
     * Values: available,pending,sold
     */
    @Serializable
    enum class Status(val value: kotlin.String) {
        @SerialName(value = "available") available("available"),
        @SerialName(value = "pending") pending("pending"),
        @SerialName(value = "sold") sold("sold");
    }
}

