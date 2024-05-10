package com.fujikawa.springeventsjdk8.events;

import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class UserCreatedListener implements ApplicationListener<UserCreatedEvent> {

    @Async
    @Override
    public void onApplicationEvent(UserCreatedEvent event) {
        
      log.info("User Created with name '{}' and email '{}'",
        event.getName(),
        event.getEmail());
    }
}
