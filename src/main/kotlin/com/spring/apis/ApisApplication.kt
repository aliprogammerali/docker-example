package com.spring.apis

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [SecurityAutoConfiguration::class])
class ApisApplication

fun main(args: Array<String>) {
    runApplication<ApisApplication>(*args)
}