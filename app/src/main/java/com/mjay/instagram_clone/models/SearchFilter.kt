package com.mjay.instagram_clone.models

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class SearchFilter(
    val id: Int,
    @DrawableRes val icon: Int? = null,
    @StringRes val name: Int,
)
