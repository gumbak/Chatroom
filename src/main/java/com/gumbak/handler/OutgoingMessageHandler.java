package com.gumbak.handler;

import org.springframework.messaging.handler.annotation.MessageMapping;

@MessageMapping("/stomp")
@SendTo("/broker/message")
public class OutgoingMessageHandler {

}
