package com.spring.apis.controller

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1")
class TestController {

    @Autowired
    lateinit var repository: Repo

    @GetMapping("/test")
    fun test()=repository.save(Book())

    @GetMapping("/test2")
    fun test2()= repository.findAll()

}

@Repository
interface Repo:JpaRepository<Book,Int>

@Entity
data class Book(@Id @GeneratedValue(strategy = GenerationType.AUTO) val id:Int=0)