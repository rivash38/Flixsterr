package com.example.flixsterr

import org.json.JSONArray

data class Movie(

    val posterPath: String,
    val movieID: Int,
    val title: String,
    val overview: String,

){

    companion object{
        fun fromJsonArray(movieJsonArray: JSONArray?) {

        }

    }
}