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
        10,
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
    WallService.add(post)
    WallService.add(post1)
    WallService.printPosts()

    println(WallService.update(postUpdate))
    WallService.printPosts()
}