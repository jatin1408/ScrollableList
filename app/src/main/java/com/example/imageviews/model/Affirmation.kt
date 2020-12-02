package com.example.imageviews.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(@StringRes val stringResourceID: Int, @DrawableRes val imageResourceId: Int) {

}