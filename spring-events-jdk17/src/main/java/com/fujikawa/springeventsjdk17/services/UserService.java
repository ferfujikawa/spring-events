package com.fujikawa.springeventsjdk17.services;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.fujikawa.springeventsjdk17.dtos.CreateUserDTO;
import com.fujikawa.springeventsjdk17.events.UserCreatedEvent;

import reactor.core.publisher.Mono;

@Service
public class UserService {

    private ApplicationEventPublisher publisher;

    public UserService(ApplicationEventPublisher publisher) {
        
        this.publisher = publisher;
    }

    public Mono<Boolean> addUser(CreateUserDTO createUserDTO) {

        //Code to register user on database...

        Mono.just(new UserCreatedEvent(this, createUserDTO.getName(), createUserDTO.getEmail()))
            .subscribe(publisher::publishEvent);

        return Mono.just(true);
    }
}
