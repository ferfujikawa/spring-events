package com.fujikawa.springeventsjdk8.events;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class UserCreatedPublisher {

    private ApplicationEventPublisher applicationEventPublisher;

    public UserCreatedPublisher(ApplicationEventPublisher applicationEventPublisher) {
     
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void publish(UserCreatedEvent event) {

        applicationEventPublisher.publishEvent(event);
    }
}
