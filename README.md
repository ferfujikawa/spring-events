# Spring Events

Demo applications using Spring Events

## Applications

This repository contains 2 projects with different versions of JDK (8 and 17) wich runs on ports 8081 and 8082, respectively.

## How to run the applications

Just start the containers by running the following command:

```bash
docker compose up
```

## Applications Endpoints

The application exposes only a **POST endpoint to create a user**.

> Curl commands to access these endpoints are showing bellow.

Example to create a user:
```bash
curl -i -X POST http://localhost:8081/users -H 'Content-Type: application/json' -d $'{ "name": "User #1", "email": "user1@email.com" }'
```
> Change the port to 8082 if you want to do a request to JDK17 application

## Application's Behavior

You can watch the log of application's container to see it's behavior on each endpoint call (there's a message on each event listener execution to show the payload of received event).

Run the following command to watch container's log:
```bash
docker logs spring-events-jdk8 -f
```
> Execute the same command switching container's name to `spring-events-jdk17` if you want to see logs from JDK17 application
