package com.easy.springboot.demo_microservice_api

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BookController {
    @RequestMapping(value = "/book/1")
    fun getOne(): Book {
        val book = Book()
        book.id = 1
        book.title = "Spring Boot 2.0 极简教程"
        book.author = "陈光剑"
        return book
    }


    class Book {
        var id: Long = 0
        var title: String = ""
        var author: String = ""
    }
}
