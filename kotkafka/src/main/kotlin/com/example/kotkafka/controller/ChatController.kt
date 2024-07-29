package com.example.kotkafka.controller

import com.example.kotkafka.service.kafka.ChatProducer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.stereotype.Controller

@Controller
class ChatController(@Autowired private val chatProducer: ChatProducer) {

//    @Autowired
//    private lateinit var chatProducer: ChatProducer


    @MessageMapping("/chat.sendMessage")
    @SendTo("/topic/messages")
    fun sendMessage(message: String) {
        println("MESSAGE ARRIVED")
        chatProducer.sendMessage(message)
    }
}