package com.reylar.aissistant.common

sealed class Screen(val route: String) {
    object Menu : Screen("menu")

    object MovieDetail : Screen("movieDetail")

    fun withArgs(vararg args: Any) : String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}