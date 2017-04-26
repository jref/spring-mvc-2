package com.ua.codespace.service.impl;


import com.ua.codespace.service.MessageService;
import org.springframework.stereotype.Component;

@Component
public class MessageServiceProvider implements MessageService {

    @Override
    public String printMessage() {
        return "Hello, from MessageService";
    }
}
