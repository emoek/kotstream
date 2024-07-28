package com.example.kotkafka.service.kafka

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.messaging.simp.SimpMessagingTemplate
import org.springframework.stereotype.Service

@Service
class ChatConsumer {

    @Autowired
    private lateinit var messagingTemplate: SimpMessagingTemplate

    @KafkaListener(topics = ["chat-topic"], groupId = "chat-group")
    fun listen(message: String) {
        messagingTemplate.convertAndSend("/topic/chat-messages", message)

    }
}