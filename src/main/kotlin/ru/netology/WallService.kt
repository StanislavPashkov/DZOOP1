package ru.netology

object WallService {
    private var posts = emptyArray<Post>()
    private var lastPostId = 0
    private var comments = emptyArray<Comment>()
    private var report = emptyArray<ReportComment>()

    fun clear() {
        posts = emptyArray()
        lastPostId = 0
    }

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

    fun createComment(postId: Post, comment: Comment): Comment {
        for (post in posts) {
            if (comment.postId == post.id) {
                comments += comment
                return comment
            }
        }
        throw PostNotFoundException("There is no record with this ID")
    }

//    fun compiaints(commentId: Comment, commentIdRepost: ReportComment, reason: ReportComment): Boolean {
//        for (id in comments) {
//            if (commentIdRepost.commentId != commentId.id) {
//               throw PostNotFoundException("There is no comment with this id")
//            } else if (reason.reason != 0){
//                throw PostNotFoundException("There is no such complaint")
//            }
//        }
//        return true
//    }

    fun printPosts() {
        for (post in posts) {
            print(post)
            println()
        }

    }

}