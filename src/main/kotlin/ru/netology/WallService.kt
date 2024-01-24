package ru.netology

object WallService {
    private var posts = emptyArray<Post>()
    private var lastPostId = 0

    fun add(post: Post): Post {
        posts += post.copy(id = ++lastPostId, likes = post.likes.copy())
        return posts.last()
    }

    fun update(newPost: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (post.id == newPost.id) {
                posts[index] = newPost.copy(likes = newPost.likes.copy())
                return true
            }
        }
        return false
    }

    fun printPosts() {
        for (post in posts) {
            print(post)
            println()
        }

    }

}