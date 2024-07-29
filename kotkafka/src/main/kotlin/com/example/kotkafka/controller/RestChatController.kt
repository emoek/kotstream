package com.example.kotkafka.controller

import com.example.kotkafka.service.kafka.ChatProducer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class RestChatController(@Autowired private var chatProducer: ChatProducer) {

    @GetMapping("/chat")
    fun sendMessage(@RequestParam(value = "message", defaultValue = "") message: String) : String{
        println("MESSAGE:$message")

        chatProducer.sendMessage(message)

        return message
    }



}