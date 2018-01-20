package com.github.atsushi130.architecture.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ArchitectureAppApplication

fun main(args: Array<String>) {
    runApplication<ArchitectureAppApplication>(*args)
}
