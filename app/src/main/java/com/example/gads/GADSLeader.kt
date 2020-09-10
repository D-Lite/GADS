package com.example.gads

data class LearningLeaders (
    val results : List<Result>
)

data class Result(
    val name: String,
    val hours: String,
    val countries: String,
    val badgeUrl: String
)
