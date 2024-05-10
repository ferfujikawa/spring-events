package com.fujikawa.springeventsjdk17.services;

import org.springframework.stereotype.Service;

import com.fujikawa.springeventsjdk17.dtos.CreateUserDTO;
import com.fujikawa.springeventsjdk17.events.UserCreatedEvent;
import com.fujikawa.springeventsjdk17.events.UserCreatedPublisher;

import reactor.core.publisher.Mono;

@Service
public class UserService {

    private UserCreatedPublisher userCreatedPublisher;

    public UserService(UserCreatedPublisher userCreatedPublisher) {
        
        this.userCreatedPublisher = userCreatedPublisher;
    }

    public Mono<Boolean> addUser(CreateUserDTO createUserDTO) {

        //Code to register user on database...

        Mono.just(new UserCreatedEvent(this, createUserDTO.getName(), createUserDTO.getEmail()))
            .subscribe(userCreatedPublisher::publishEvent);

        return Mono.just(true);
    }
}
