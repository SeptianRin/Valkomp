package io.github.septianrin.valkomp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform