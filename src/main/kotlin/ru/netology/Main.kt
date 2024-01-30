package ru.netology

fun main() {
    val post = Post(
        1,
        CurrentDate(),
        11,
        111,
        1111,
        "Hello World",

        Comments(),
        Copyright(),
        Likes(),
        true,
        false
    )
    val post1 = Post(
        2,
        CurrentDate(),
        12,
        122,
        122,
        "Hello Netology",
        Comments(),
        Copyright(),
        Likes(10),
        true,
        true
    )
    val postUpdate = Post(
        1,
        CurrentDate(),
        12,
        122,
        122,
        "Hello Kotlin",
        Comments(),
        Copyright(),
        Likes(10),
        true,
        true
    )
//    WallService.add(post)
//    WallService.add(post1)
//
//
//    println(WallService.update(postUpdate))
//    WallService.printPosts()
//    println()


//    val comment =
//    Comment(
//        5, 8, 44, CurrentDate(), "Avada Kedavra"
//    )
//    val reportComment = ReportComment(4,5,0)
//    val reason = ReportComment(6,3,0)

//    println(WallService.createComment(post, comment))
//
//    println()
//
//    println( WallService.compiaints(comment,reportComment,reason))




}

