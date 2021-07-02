package edu.nkotlin

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Superhero(val name: String, val alterEgo: String, val bio: String, val power: Float) :
    Parcelable {
}