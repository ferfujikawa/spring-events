package com.fujikawa.springeventsjdk8.events;

import org.springframework.context.ApplicationEvent;

import lombok.Getter;

@Getter
public class UserCreatedEvent extends ApplicationEvent {

    private String name;
    private String email;

    public UserCreatedEvent(Object source, String name, String email) {
     
        super(source);
        this.name = name;
        this.email = email;
    }
}
