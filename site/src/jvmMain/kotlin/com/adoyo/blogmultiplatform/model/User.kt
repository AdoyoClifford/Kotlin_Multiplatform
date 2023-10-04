package com.adoyo.blogmultiplatform.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.litote.kmongo.id.ObjectIdGenerator

@Serializable
data class User(
    @SerialName(value = "_id")
    val id: String = ObjectIdGenerator.newObjectId<String>().id.toString(),
    val username: String = " ",
    val password: String = " "
)
