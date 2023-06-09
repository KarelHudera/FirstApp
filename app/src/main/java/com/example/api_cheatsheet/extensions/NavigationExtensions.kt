package com.example.api_cheatsheet.extensions

import androidx.navigation.NavController
import androidx.navigation.NavDirections

fun NavController.safeNavigate(directions: NavDirections) {
    try {
        navigate(directions)
    } catch (e: Exception) {
        // do nothing
    }
}