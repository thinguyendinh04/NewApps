package com.dinhthi2004.newapps.presentation.onboarding

import androidx.annotation.DrawableRes
import com.dinhthi2004.newapps.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "Welcome to our App!",
        description = "Discover a world of new possibilities with our innovative app.",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Simplify Your Tasks",
        description = "Our app offers a seamless and intuitive way to manage your daily activities.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Enhance Your Productivity",
        description = "Boost your productivity with our powerful features and smart tools.",
        image = R.drawable.onboarding3
    )
)