package com.fujikawa.springeventsjdk17.events;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class UserCreatedListener {

    @EventListener
    public void handleUserCreatedEvent(UserCreatedEvent event) {
        
        log.info("User Created with name '{}' and email '{}'",
        event.getName(),
        event.getEmail());
    }

}
