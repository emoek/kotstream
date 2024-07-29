package com.example.kotkafka.service.kafka

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class ChatProducer(@Autowired private val kafkaTemplate: KafkaTemplate<String, String>) {

//    private const val TOPIC: String = "chat-topic"
    companion object {
        private const val TOPIC = "chat-topic"
    }

//    @Autowired
//    private lateinit var kafkaTemplate: KafkaTemplate<String, String>


    fun sendMessage(message: String) {
        println("PRODUCING MESSAGE")
        kafkaTemplate.send(TOPIC, message)
    }

}