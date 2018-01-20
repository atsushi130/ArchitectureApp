package com.github.atsushi130.architecture.app.configuration

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.ScopedProxyMode
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@EnableWebMvc
@Configuration
@ComponentScan(
        scopedProxy  = ScopedProxyMode.TARGET_CLASS,
        basePackages = [
                "com.github.atsushi130.architecture.app.domain",
                "com.github.atsushi130.architecture.app.presentation"
        ],
        basePackageClasses = [ApplicationDataSourceConfiguration::class]
)
class ApplicationConfiguration: WebMvcConfigurer {

    @Autowired
    private lateinit var applicationContext: ApplicationContext

    /**
     * register the component holding the application context of spring in container.
     */
    @Bean
    fun applicationContextHolder(): ApplicationContextHolder {
        val applicationContextHolder = ApplicationContextHolder()
        applicationContextHolder.context = this.applicationContext
        return applicationContextHolder
    }

}