package ru.netology

data class Comment(
    val id: Int,
    val postId: Int,
    val fromId: Int,
    val date: CurrentDate,
    val text: String
)
