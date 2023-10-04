package com.adoyo.blogmultiplatform.data

import com.adoyo.blogmultiplatform.model.User

interface MongoRepository {
    suspend fun checkUserExistence(user: User)
}