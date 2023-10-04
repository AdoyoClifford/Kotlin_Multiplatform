package com.adoyo.blogmultiplatform.pages

import androidx.compose.runtime.*
import com.adoyo.blogmultiplatform.pages.admin.Login
import com.varabyte.kobweb.core.Page

@Page
@Composable
fun HomePage() {
    // TODO: Add content here
    Login()
    println("Hello World!")
}
