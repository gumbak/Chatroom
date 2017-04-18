package com.gumbak.handler;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;

@MessageMapping("/stomp")
public class OutgoingMessageHandler {

}
