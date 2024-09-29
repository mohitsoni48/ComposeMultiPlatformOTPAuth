package com.mohitsoni.composemultiplatformotpauth

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform