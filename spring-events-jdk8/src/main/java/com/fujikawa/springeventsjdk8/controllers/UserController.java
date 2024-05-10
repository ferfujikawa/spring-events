package com.fujikawa.springeventsjdk8.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fujikawa.springeventsjdk8.dtos.CreateUserDTO;
import com.fujikawa.springeventsjdk8.services.UserService;

import reactor.core.publisher.Mono;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public Mono<ResponseEntity<Boolean>> createUser(@RequestBody CreateUserDTO createUserDTO) {
        
        return userService.addUser(createUserDTO)
            .map(response -> ResponseEntity.ok().body(response));
    }
}
