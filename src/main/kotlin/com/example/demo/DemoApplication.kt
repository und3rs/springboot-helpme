package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan


@SpringBootApplication
@ComponentScan("com.example.demo")
@ConfigurationPropertiesScan("com.example.demo")
class DemoApplication

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
