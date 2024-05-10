package com.fujikawa.springeventsjdk17.events;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class UserCreatedPublisher implements ApplicationEventPublisherAware, ApplicationEventPublisher {

    private ApplicationEventPublisher publisher;

    @Override
    public void publishEvent(Object event) {
        
        this.publisher.publishEvent(event);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        
        this.publisher = applicationEventPublisher;
    }
}
