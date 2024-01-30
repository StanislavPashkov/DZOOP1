package ru.netology

import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse


class WallServiceTest {

    @Before
    fun clearBeforeTest() {
        WallService.clear()
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        val service = WallService
        val post = Post(
            1, CurrentDate(), 11, 111, 1111, "Hello World",
            Comments(), Copyright(), Likes(), true, false
        )
        service.add(post)
        val comment = Comment(
            2, 2, 44, CurrentDate(), "Avada Kedavra"
        )
        service.createComment(post, comment)

    }

    @Test
    fun createCommentTest() {
        val post = Post(
            1, CurrentDate(), 11, 111, 1111, "Hello World",
            Comments(), Copyright(), Likes(), true, false
        )
        WallService.add(post)
        val actual = Comment(
            1, 1, 44, CurrentDate(), "Avada Kedavra"
        )
        val expected = WallService.createComment(post, actual)
        assertEquals(expected, actual)

    }


    @Test
    fun add() {
        val service = WallService
        val postNew = service.add(
            Post(
                1, CurrentDate(), 11, 111, 1111, "Hello World",
                Comments(), Copyright(), Likes(), true, false
            )
        )
        assertTrue(postNew.id > 0)
    }

    @Test
    fun updateTrue() {
        val service = WallService
        val post = Post(
            1, CurrentDate(), 11, 111, 1111, "Hello World",
            Comments(), Copyright(), Likes(), true, false
        )
        val post1 = Post(
            2, CurrentDate(), 12, 122, 122, "Hello Netology",
            Comments(), Copyright(), Likes(10), true, true
        )
        val postUpdate = Post(
            1, CurrentDate(), 12, 122, 122, "Hello Kotlin",
            Comments(), Copyright(), Likes(10), true, true
        )
        service.add(post)
        service.add(post1)
        assertTrue(service.update(postUpdate))
    }

    @Test
    fun updateFalse() {
        val service = WallService
        val post = Post(
            1, CurrentDate(), 11, 111, 1111, "Hello World",
            Comments(), Copyright(), Likes(), true, false
        )
        val post1 = Post(
            2, CurrentDate(), 12, 122, 122, "Hello Netology",
            Comments(), Copyright(), Likes(10), true, true
        )
        val postUpdate = Post(
            10, CurrentDate(), 12, 122, 122, "Hello Kotlin",
            Comments(), Copyright(), Likes(10), true, true
        )
        service.add(post)
        service.add(post1)
        assertFalse(service.update(postUpdate))
    }
}