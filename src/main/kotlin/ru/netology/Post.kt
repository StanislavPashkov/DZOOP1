package ru.netology

data class Post(
    val id: Int,
    val date: CurrentDate,
    val ownerId: Long,
    val fromId: Long,
    val createdBy: Long,
    val text: String,
    val comments: Comments,
    val copyright: Copyright,
    val likes: Likes,
    val canPin: Boolean,
    val canDelete: Boolean

)
