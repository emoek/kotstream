package com.example.kotkafka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotkafkaApplication

fun main(args: Array<String>) {
	println("Starting application...")
	runApplication<KotkafkaApplication>(*args)
}
