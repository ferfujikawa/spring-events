package com.fujikawa.springeventsjdk17.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fujikawa.springeventsjdk17.dtos.CreateUserDTO;
import com.fujikawa.springeventsjdk17.services.UserService;

import reactor.core.publisher.Mono;

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
