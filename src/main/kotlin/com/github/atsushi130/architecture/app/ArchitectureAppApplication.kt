package com.github.atsushi130.architecture.app

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
@EnableAutoConfiguration
class ArchitectureAppApplication {
    companion object {
        @JvmStatic fun main(vararg args: String) {
            try {
                SpringApplication.run(ArchitectureAppApplication::class.java, *args)
            } catch (exception: Exception) {
                println(exception.message)
            }
        }
    }
}

