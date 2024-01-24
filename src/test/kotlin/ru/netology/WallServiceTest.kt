package ru.netology

import org.junit.Assert.assertTrue
import org.junit.Test
import kotlin.test.assertFalse


class WallServiceTest {

    @Test
    fun add() {
        val service = WallService
        val postNew = service.add(
            Post(
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
        )
        assertTrue(postNew.id > 0)
    }

    @Test
    fun updateTrue() {
        val service = WallService
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
        service.add(post)
        service.add(post1)
        assertTrue(service.update(postUpdate))
    }

    @Test
    fun updateFalse() {
        val service = WallService
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
        service.add(post)
        service.add(post1)
        assertFalse(service.update(postUpdate))
    }
}