package com.pinhobrunodev.service1;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    private final CreateEventTrackerClient client;

    public EventController() {
        this.client = new CreateEventTrackerClient("localhost", 50051);
    }

    @PostMapping(value = "/criar")
    public void criar(@RequestBody CreateEventDto createEventDto) {
        client.create(createEventDto);
    }
}
