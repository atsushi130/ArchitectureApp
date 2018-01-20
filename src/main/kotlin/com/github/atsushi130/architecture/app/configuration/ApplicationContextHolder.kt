package com.github.atsushi130.architecture.app.configuration

import org.springframework.context.ApplicationContext
import org.springframework.context.ApplicationContextAware

class ApplicationContextHolder: ApplicationContextAware {

    lateinit var context: ApplicationContext

    override fun setApplicationContext(applicationContext: ApplicationContext) {
        this.context = applicationContext
    }
}